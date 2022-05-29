package MapsLogic;

public class Engine {
    private int[][] map;
    public final int EMPTY = -1;
    public final String[] cities = new String[]{
                    "Jamshedpur",
                    "New-York",
                    "New-Delhi",
                    "Kolkata",
                    "London",
                    "Sydney",
                    "Chennai"
            };
    protected final int DEFAULT_SIZE = 7;
    public Engine() {
        this.map = new int[DEFAULT_SIZE][DEFAULT_SIZE];
        this.initMap();
    }
    private void initMap() {
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map.length; j++)
                map[i][j] = EMPTY;
    }
    public Engine(int noOfCities) throws Exception {
        if (noOfCities < 7)
            throw new Exception("Insufficient Number of cities < 7!!");
        this.map = new int[noOfCities][noOfCities];
        this.initMap();
    }

    public String rawMap() {
        StringBuilder str = new StringBuilder();
        str.append("Source").append("\t").append("Dest.").append("\n\n");
        for (int src = 0; src < map.length; src++) {
            for (int dest = 0; dest < map.length; dest++) {
                if (map[src][dest] != EMPTY)
                    str.append(cities[src]).append("->").append(cities[dest]).append("\n");
            }
        }
        return str.toString();
    }
}

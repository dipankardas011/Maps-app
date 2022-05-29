package Maps;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppEngineTest {
  protected static MapsLogic.Engine xyz;

  @BeforeAll
  @DisplayName("Initialilize Values")
  static void initMap() {
      xyz = new MapsLogic.Engine();
      assertNotNull(xyz);
  }

  @Test
  @DisplayName("Initial Values of Maps")
  void checkDefaultOutPut() {
      assertNotNull(xyz.rawMap());
  }
}
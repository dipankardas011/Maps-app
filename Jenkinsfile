pipeline {
    agent {
        label 'worker'
    }

    stages {
        stage('Git checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/dipankardas011/Maps-app.git'
                echo 'Checked out'
            }
        }

        stage ('Build') {
            steps {
                sh 'gradle build'
                echo 'Successfully Build!!'
            }
        }

        stage ('Testing') {
            steps {
                sh 'gradle test -i'
                echo 'Tests "PASSED"!!'
            }
        }

        stage ('Deploying') {
            steps {
                echo 'Running App...'
                sh 'gradle run'
            }
        }

    }
}
pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Verify Artifact') {
            steps {
                bat 'dir target'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t notes-app:%BUILD_NUMBER% .'
            }
        }

        stage('Verify Image') {
            steps {
                bat 'docker images'
            }
        }

    }
}
pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3.9'
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
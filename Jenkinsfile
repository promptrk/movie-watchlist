pipeline {
    agent any
    tools {
        maven 'Maven-3.8.x'
        jdk 'JDK-21'
    }
    stages {
        stage('Git Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Maven Test & Package') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Image Build') {
            steps {
                script {
                    docker.image('movie-watchlist:latest').build('.')
                }
            }
        }
    }
}

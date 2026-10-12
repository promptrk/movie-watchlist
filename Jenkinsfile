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
                sh 'docker build -t movie-watchlist:latest .'
            }
        }
    }
}

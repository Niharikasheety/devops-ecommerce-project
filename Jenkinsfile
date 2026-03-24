pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/Niharikasheety/devops-ecommerce-project.git'
            }
        }

        stage('Build Project') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t demo-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker rm -f demo-container || true
                docker run -d -p 9090:9090 --name demo-container demo-app
                '''
            }
        }
    }
}

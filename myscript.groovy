pipeline {
    agent any

    stages {
         stage('Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/SanikayYadav-123/my-pr-repo.git'
            }
         }
         
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
pipeline {
    agent any
    stages {
        stage('Pull'){
            steps {
                git 'https://github.com/Hiteshmankar123/new_practice_repo.git'
            }
        }
        stage('Build'){
           steps {
                withSonarQubeEnv('sonar') {
                      sh 'mvn clean package sonar:sonar'
                }       
            }
        }
        stage("Quality Gate") {
            steps {
              timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
              }
            }
        }      
        stage('Test'){
            steps {
                echo 'Test Successful by Hitesh'
            }
        }
        stage('Deploy'){
            steps {
                echo 'Deploy Successful by Hitesh'
            }
        }
    }

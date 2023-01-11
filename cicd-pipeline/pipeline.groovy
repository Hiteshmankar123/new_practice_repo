pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
              git 'https://github.com/Hiteshmankar123/new_practice_repo.git'  
            }
        }
        stage('Build') { 
            steps {  
                 echo "Build successful by Hitesh"        
            }
        }
        stage('Test') { 
            steps {
                echo "Test successful"                
            }
        }
        stage('Deploy') { 
            steps {  
               echo "deploy successful"       
            }
        }
    }
}   

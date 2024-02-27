pipeline{
    agent any
    tools {maven "maven-3.5.2"}
    triggers {         
        pollSCM('H/3 * * * *')     
    }
    
    stages {
        stage('Checkout'){
            steps{
                git branch: 'dev', url :'https://github.com/LucMartin91/Devops/'
            }
        }
        
        stage('Build'){
            steps{
                sh 'mvn compile'
            }
        }
        
        stage('Javadoc'){
            steps{
                sh 'mvn javadoc:javadoc'
            }
        }
        
    }
}

pipeline {
    agent any // Utiliser n'importe quel agent disponible
    
    tools {
        // Assurez-vous que "Maven_3_5_2" correspond au nom que vous avez donné à l'installation de Maven dans la configuration globale de Jenkins
        maven 'Maven-3.5.2'
    }
    
    triggers {
        cron('H/3 * * * *') // Vérifier les changements du SCM toutes les 3 minutes
    }
    

    stages {
        stage('Récupération du code source') {
            steps {
                checkout scm // Cette commande clone le dépôt et vérifie la branche correcte
            }
        }
        
        stage('Compilation') {
            steps {
                script {
                    // Compile le projet sans exécuter les tests
                    sh 'mvn clean compile -DskipTests'
                }
            }
        }
        
        stage('Publication de la Javadoc') {
            steps {
                script {
                    // Génère la Javadoc
                    sh 'demo/demo/mvn javadoc:javadoc'
                }
            }
        }
    }
    
    }
}

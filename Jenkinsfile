pipeline {
    agent any // Utiliser n'importe quel agent disponible
    
    triggers {
        pollSCM('H/3 * * * *') // Vérifier les changements du SCM toutes les 3 minutes
    }
    
    options {
        skipStagesAfterUnstable() // Pour ne pas continuer après un échec de compilation
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
                    
                    // Archive la Javadoc en tant qu'artefact
                    archiveArtifacts artifacts: 'target/site/apidocs/**/*', fingerprint: true
                }
            }
        }
    }
    
    post {
        always {
            // Archiver les artefacts même en cas d'échec
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}

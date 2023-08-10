pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your code from version control (e.g., Git)
                checkout scm
            }
        }
        
        stage('Build and Test') {
            steps {
                // Build and test your Maven project
                script {
                   def mvnHome = tool name: 'MAVEN_HOME', type: 'maven'
                    bat "${mvnHome}/bin/mvn test -X"
                }
            }

post {
                always {
                    // Archive test reports (e.g., surefire reports)
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}

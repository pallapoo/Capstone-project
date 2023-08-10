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
                    def mvnHome = tool 'MAVEN_HOME' // Assumes you've configured Maven in Jenkins
                    bat "${mvnHome}\\bin\\mvn clean test -DsuiteXmlFile=testng.xml"
                }
            }
        }
    }
}

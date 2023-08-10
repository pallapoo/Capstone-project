pipeline{
    agent any
    tools {nodejs "NodeJS"}
    stages{
        stage('Source') {
            steps{
                git 'https://github.com/pallapoo/estore-admin-app.git'

                sh "--npm install -f"

                echo 'Source stage finished'
            }
        }

        stage('Build'){
            steps{
                sh "npm run ng build"
                echo 'Build stage finished'


            }
        }
    }
}
pipeline {
    tools {
        maven "Maven"
    }
    
    agent any

    stages {
        stage('Clone Git') {
            steps {
                git branch: 'main', url: 'https://github.com/divyamagwl/Calculator_DevOps'
            }
        }
        stage('Maven build') {
            steps {
                dir("calculator/") {
                    script{
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
    
}
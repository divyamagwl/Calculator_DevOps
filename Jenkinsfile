pipeline {
    tools {
        maven "Maven"
    }
    
    agent any

    environment
    {
        registry = "divyamagwl/calculator"
        registryCredential = "dockerhub"
        dockerImage = ""
    }

    stages {
        stage('Pull GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/divyamagwl/Calculator_DevOps'
            }
        }
        stage('Build Maven jar package') {
            steps {
                dir("calculator/") {
                    script{
                        sh 'mvn clean install'
                    }
                }
            }
        }
        stage('Docker Image Build') {
            steps {
                script {
                    dockerImage = docker.build(registry + ":latest")
                }
            }
        }
        stage('DockerHub Image Push') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning Up') {
            steps {
                sh "docker rmi $registry:latest" 
            }
        }    
        stage('Curr Directory') {
            steps {
                sh 'ls'
            }
        }
        stage('Ansible pull image') {
            steps {
                ansiblePlaybook colorized: true, 
                disableHostKeyChecking: true, 
                installation: 'Ansible', 
                inventory: 'inventory',
                playbook: 'playbook.yml'
            }
        }
    }
}
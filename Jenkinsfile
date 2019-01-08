pipeline {
    agent any

    tools{
        maven "maven.3.6.0"
        jdk "JDK11"
    }

    stages {
        stage('Build') {
            steps {
                sh 'cd LearnJava && mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "I am doing Test"'
            }
        }
        stage('Deploy') {
            steps {
                sh ' echo "I am doing deploy"'
            }
        }
    }
}
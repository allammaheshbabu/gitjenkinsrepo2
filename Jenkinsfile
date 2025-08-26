pipeline {
    agent any

    tools {
        maven 'Maven3'   // make sure Maven3 is configured in Jenkins (Global Tool Configuration)
        jdk 'JDK11'      // make sure JDK11 (or JDK17) is configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                git branch: 'main', url: 'https://github.com/allammaheshbabu/gitjenkinsrepo2.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling project...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests finished successfully!'
        }
        failure {
            echo '❌ Build or tests failed!'
        }
    }
}

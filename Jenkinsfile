pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -version'
            }
        }
        stage('deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'df166052-2ae1-4ab7-9807-f0bab8c51d22', path: '', url: 'http://65.0.95.72:8080/')], contextPath: 'test', war: '**/*.war'
            }
        }

    }
}

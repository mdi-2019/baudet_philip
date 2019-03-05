pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'build'
                sh 'mvn clean cobertura:cobertura -Dcobertura.report.format=xml'
                sh 'mvn pmd:pmd'
            }
        }
    }
}
@Library('Shared') _

pipeline {
    agent {
        label "XApp"
    }

    stages {
        stage("Clone Code") {
            steps {
                script {
                    gitCodeClone(
                        'https://github.com/ecommerce-platform-by-shri/customer-service.git',
                        'develop'
                    )
                }
            }
        }
        stage("Build"){
            steps{
                script{
                    dockerBuild('Customer-Service')
                }
            }
        }
    }
}

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
                    dockerBuild('customer-service')
                }
            }
        }

        stage('Push to docker hub'){
            steps{
                script{
                    dockerPush('customer-service','latest','UsernameAndPassword')
                }
            }
        }

        stage('Done'){
            steps{
                echo "All done"
            }
        }
    }
}

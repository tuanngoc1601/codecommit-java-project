#!groovy
pipeline {
	agent none
      stages {
        stage('Maven Clean') {
            agent any
          steps {
            sh 'mvn clean'
          }
        }
        stage('Maven Package'){
            agent any
            steps {
                sh 'mvn package'
            }
        }
        stage('Jar Run') {
            agent any
            steps {
                withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                    sh 'fuser -k 5000/tcp || true'
                    sh 'nohup java -jar target/demo-0.0.1-SNAPSHOT.jar > log-greetings.log 2>&1 &'
                }
            }
        }
    }
}
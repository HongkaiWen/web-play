pipeline {
  agent any
  stages {
    stage('package') {
      steps {
        echo 'starting'
        sh 'git clone https://github.com/HongkaiWen/web-play.git'
        sh 'mvn clean package -DskipTests'
      }
    }
  }
}
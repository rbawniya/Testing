pipeline {
  agent any
  stages {
    stage('Maven install') {
		agent any
      steps {
        sh 'mvn clean install'
      }
    }
  }
}

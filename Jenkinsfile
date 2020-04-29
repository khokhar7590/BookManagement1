node{
  stage('SCM Checkout'){
    git 'https://github.com/khokhar7590/BookManagement'
  }
  stage('Compile-Package'){
    def mavenHome = tool name: 'maven-3', type: 'maven'
    sh "${mavenHome}/bin/mvn package"
  }
}

node{
  stage('SCM Checkout'){
    git 'https://github.com/khokhar7590/BookManagement'
  }
  stage('Compile-Package'){
    def mavenHome = tool name: 'maven-3', type: 'maven'
    echo "${mavenHome}"
    jdk = tool name: 'JDK8'
    env.JAVA_HOME = "${jdk}"
    echo "jdk installation path is: ${jdk}"
    bat "${mavenHome}/bin/mvn package"
  }
}

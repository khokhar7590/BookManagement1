node{
    def mavenHome = tool name: 'maven-3', type: 'maven'
    echo "${mavenHome}"
    jdk = tool name: 'JDK8'
    env.JAVA_HOME = "${jdk}"
    echo "jdk installation path is: ${jdk}"
  stage('SCM Checkout'){
    git 'https://github.com/khokhar7590/BookManagement'
  }
  stage('Compile-Package'){
    bat "${mavenHome}/bin/mvn package"
  }
  stage('Copying Jar to correct folder'){
    cd target
    //del C:/Users/deepak/Downloads/Software/JenkinsBuildJar/[*].bkp
    //ren C:/Users/deepak/Downloads/Software/JenkinsBuildJar/[*].jar [*].bkp
    copy '.jar$' 'C:/Users/deepak/Downloads/Software/JenkinsBuildJar'
  }
}

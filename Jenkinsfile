pipeline
{
    agent any

    environment
    {
        PATH="/opt/apache-maven-3.8.4/bin/:$PATH"
    }
    

    stages 
    {
        stage('Print')
        {
            echo 'OK'
        }
        stage('Checkout') 
        {
            steps 
            {
                git branch: 'main', url: 'https://github.com/SandeepChatuphale/javawebmaven.git'
            }
        }
        
        stage('Maven Package') 
        {
            steps 
            {
                sh 'mvn clean package'
            }
        }
        
        stage('Copy war') 
        {
            steps 
            {
               sshPublisher(publishers: [sshPublisherDesc(configName: 'TomcatServer', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'cp -r *.war /opt/apache-tomcat-9.0.58/webapps/', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '.', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/*.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
        
    }
}

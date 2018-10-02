# Setup of the Welcome Guy Project

The project is based on the springboot framework and will be deployed in a tomcat standalone server.
To be able to run the project the following steps are necessary.

The setup will be described just for the ubuntu 16.04-LTS OS

## Installing Java

The project requires java 8. If this is not yet available on your computer run the following commands to install it.

  - Add oracle java repository to ubuntu
  
        sudo add-apt-repository ppa:webupd8team/java
        
  - Get recent updates with:
  
        sudo apt-get update -y
        
  - Install the JDK with: 
    
        sudo apt-get install oracle-java8-installer
        
  - Set the JAVA_HOME environment variable with:
  
         export JAVA_HOME=<path_to_jdk>
   
  - Verify installation with:
        
        java -version  ## expected result is java version "1.8.0_151" or something similar.

## Installing maven
  
  - Visit the maven [website](https://maven.apache.org/download.cgi) and copy the link to the maven version you want to install. In this case http://www-us.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
  
  - go to `/opt/`
  
        cd /opt/
  - Download the file with 
  
        wget http://www-us.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
        
  - Extract with the command 
  
         sudo tar -xvzf apache-maven-3.5.4-bin.tar.gz
         
  - Next, rename the extracted directory
  
        sudo mv apache-maven-3.5.4 maven
        
  - Add the following line to the `mavenenv.sh` file in `/etc/profile.d/` to set the environment variables. If the file is not available create it and update it as follows:
  
        sudo nano /etc/profile.d/mavenenv.sh
        
        export M2_HOME=/opt/maven
        
        export PATH=${M2_HOME}/bin:${PATH}
  
  - After saving the file execute the following commands to apply the changes
  
        sudo chmod +x /etc/profile.d/mavenenv.sh
        sudo source /etc/profile.d/mavenenv.sh
  - Verify installation with
  
        mvn --version  


## Installing tomcat

Follow the instruction [here](https://www.liquidweb.com/kb/install-apache-tomcat-8-ubuntu-16-04/) to install tomcat.

## Clone and run the project locally 

-  change to the directory where you want to save the project and run the following

        git clone https://github.com/Desire321/training1.git

- change in HelloBoot with:

        cd ./HelloBoot
        
- Run the project with the following command on the command line with

        mvn clean package
        
  or open it in your favorite IDE and run it from there
  
- Open the browser and type the following

        http://localhost:8080
        
## Deploy to tomcat

Copy the war file generated and stored in the target directory in the tomcat release directory and run tomcat




### References

- https://www.mkyong.com/spring-boot/spring-boot-deploy-war-file-to-tomcat/
- https://www.vultr.com/docs/how-to-install-apache-maven-on-ubuntu-16-04
- https://www.liquidweb.com/kb/install-apache-tomcat-8-ubuntu-16-04/ 

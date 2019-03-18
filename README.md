# onlineretailstore

Pre-requisites to run application are Java, Maven and Git. 
*  Installation instructions for Maven are available at https://maven.apache.org/install.html
*  Java can be installed from http://www.oracle.com/technetwork/java/javase/downloads/index.html
*  Latest Git version can be installed from https://git-scm.com/downloads

Steps to build and run locally:
* Open commandline
* Create a new directory called onlineretailstore
* Clone the directory given in the  email
uild the executable jar using maven=> mvn package  
* Go to target folder => cd target
* Run following command to start the server on port 8080=> java -jar RetaileStoreApplication-0.0.1-SNAPSHOT.jar 
* Optionally, one can configure port using commandline parameter => --server.port=9090 
* Access and invoke APIs using url => http://localhost:8080/swagger-ui.html
* Application will ask for authentication credentials during invocation of API's. Use 'media' as user id and  'ocean'password.

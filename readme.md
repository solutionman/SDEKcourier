
before running application see database.md

start mysql:
service mysql status
service mysql start

to build:

mvn clean install
or
mvn clean package

then place  
courier.war
in tomcat webapps

start tomcat:
./catalina.sh jpda start

then open url:

localhost:8080/courier


stop tomcat and mysql:
./shutdown.sh
service mysql stop
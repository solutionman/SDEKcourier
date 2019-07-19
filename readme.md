to build:

mvn clean install
or
mvn clean package

then place  
courier-1.war
in tomcat webapps

then open url:

localhost:8080/courier-1


before   mvn clean install
in SpringConfig.java

for mysql:
jdbc:mysql://localhost:3306/vebinar?useSll=false

for mariaDB:
jdbc:mariadb://localhost:3306/vebinar?useSll=false



FROM openjdk:8
EXPOSE 8080
ADD target/productservice-docker-mysql.jar productservice-docker-mysql.jar
ENTRYPOINT ["java","-jar","/productservice-docker-mysql.jar"]
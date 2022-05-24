FROM openjdk:11
COPY . /java
WORKDIR /java
#RUN javac src/main/java/spring/test/blog/BlogDemoApplication.java
ARG JAR_FILE=target/blog-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} /java/blog.jar
ENTRYPOINT ["java", "-jar", "/java/blog.jar"]
EXPOSE 8080
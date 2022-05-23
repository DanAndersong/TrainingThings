FROM openjdk:11
COPY . /java
WORKDIR /java
RUN javac src/main/java/org/example/App.java
EXPOSE 9031
CMD ["java", "src/main/java/org/example/App.java"]
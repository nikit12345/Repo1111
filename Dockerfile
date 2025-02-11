FROM openjdk:17
EXPOSE 8081
WORKDIR /app
COPY ./target/pipeline-project.jar /app
CMD ["java","-jar","pipeline-project.jar"]



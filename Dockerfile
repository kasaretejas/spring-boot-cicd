#specifing java version
FROM openjdk:17
#creating direcory inside container
WORKDIR /app
#copying jar file of our peoject inro above directory
COPY ./target/spring-boot-cicd-1.0.0.jar /app
#Expose port
EXPOSE 8080
#command to run jar file
CMD [ "java", "-jar", "spring-boot-cicd-1.0.0.jar" ]
FROM openjdk:8
EXPOSE 8080
ADD /target/address-bookapp.jar address-bookapp.jar
ENTRYPOINT ["java" , "-jar" ,"/address-bookapp.jar"]
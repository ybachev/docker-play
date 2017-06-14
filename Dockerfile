FROM java:8
VOLUME /tmp
ADD /target/docker-play-employee-0.0.1-SNAPSHOT.jar play-employee-app.jar
EXPOSE 8080
RUN bash -c 'touch /play-employee-app.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/admin", "-Djava.security.egd=file:/dev/./urandom","-jar","/play-employee-app.jar"]

# use when only mongo is in container
#"-Dspring.data.mongodb.uri=mongodb://172.17.0.3:27017/admin",
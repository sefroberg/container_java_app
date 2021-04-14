FROM openjdk:11.0.9
COPY SimpleApp/ /usr/src/SimpleApp
WORKDIR /usr/src/SimpleApp
RUN javac SimpleApp.java
CMD ["java", "SimpleApp"]

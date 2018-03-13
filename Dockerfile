FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/p.jar /p/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/p/app.jar"]

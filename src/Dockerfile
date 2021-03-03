FROM openjdk:11-jre-slim

EXPOSE 7000
# This is for the javalin application
ENTRYPOINT ["java", "-jar", "/usr/share/javalin/my-javalin.jar"]

ARG JAR_FILE
ADD ../out/artifacts/SintefSemantic_jar/SintefSemantic.jar /usr/share/javalin/my-javalin.jar
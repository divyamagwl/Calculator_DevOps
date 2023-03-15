FROM openjdk:11
ADD ./calculator/target/calculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
ENTRYPOINT ["java","-jar","/calculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]
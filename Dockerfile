FROM openjdk

WORKDIR /app

COPY target/vendas-0.0.1-SNAPSHOT.jar /app/vendas-app.jar

ENTRYPOINT ["java","-jar","vendas-app.jar"]
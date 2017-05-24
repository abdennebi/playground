FROM openjdk:alpine
# Spring Boot application creates working directories for Tomcat by default
VOLUME /tmp
ADD frontend.jar frontend.jar
# To reduce Tomcat startup time we added a system property pointing to "/dev/urandom" as a source of entropy.
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/frontend.jar", "--frontend.product.url=${PRODUCT_URL}", "--frontend.stock.url=${STOCK_URL}","--server.port=${PORT}"]
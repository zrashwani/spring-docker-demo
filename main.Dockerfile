# This is example dockerfile for running spring boot
# previously it was executed by following command
#  docker run --rm --name spring-web -p 81:8080 \
#   -v $(pwd):/usr/src/spring-docker-demo \
#   -w /usr/src/spring-docker-demo
#   maven mvn spring-boot:run

FROM maven

LABEL maintainer="Zeid Rashwani <zrashwani@expedia.com>"

WORKDIR /usr/src/spring-docker-demo

COPY . /usr/src/spring-docker-demo

EXPOSE 8080

RUN mvn clean install

ENTRYPOINT ["mvn", "spring-boot:run"]

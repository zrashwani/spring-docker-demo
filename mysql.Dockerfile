# Example docker file for mysql
# Older version executed by following command:
# docker run -d -e MYSQL_ROOT_PASSWORD=dockerpass123
#  -v mysql8-test-volume:/var/lib/mysql
#  --network demo_network
#  --name db_mysql mysql

FROM mysql

LABEL maintainer="Zeid Rashwani <zrashwani@gmail.com>"

ENV MYSQL_DATABASE=docker_demo
ENV MYSQL_ROOT_PASSWORD=dockerpass123

COPY ./docker-sql-scripts.sql /docker-entrypoint-initdb.d/

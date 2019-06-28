--liquibase formatted sql

--changeset zrashwani:1556524888130-1
INSERT INTO users(username, description) VALUES('docker-user-1', 'docker user inserted from spring boot app');
INSERT INTO users(username, description) VALUES('docker-user-2', 'another docker user inserted from spring boot app2');

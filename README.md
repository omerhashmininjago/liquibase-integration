# spring-data-liquibase-integration

Liquibase will help you deploy your DB changes automatically via the application deployment using Spring Boot

In this demo i am connected to an in memory DB

A Maven plugin is separately configured to a H2 Data source, where while creating the artifact, the db scripts will be triggered and validated.
IF there are any errors, the artifact creation will fail. Hence the developer will not be able to proceed with the deployment.

This is a necessary step to make sure, the scripts are good before going into deployment.


When the application is deployed, the db scripts will get auto triggered. Here the DB can be change to Oracle, Mongo etc.

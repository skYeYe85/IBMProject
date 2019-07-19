# CIC-Challenge

Showing partial data of San Francisco [Movie-Database](https://data.sfgov.org/resource/wwmu-gmzc.json) as a REST-Service
Showing partial data of San Francisco [Emissions](https://data.sfgov.org/resource/pxac-sadh.json) as a REST-Service

## Technology-Stack

* [spring Initializr 2.1.6](https://start.spring.io/)
* [Eclipse IDE  2019-06 (4.12.0)](https://www.eclipse.org/downloads/packages/)
* [JDK 11.0.4](https://www.computerbase.de/downloads/systemtools/entwicklung/java-se-development-kit/)
* [Maven 3.6.1](https://maven.apache.org/download.cgi)
* [Eclipse Spring Plugin 4.3.1](https://marketplace.eclipse.org/content/spring-tools-4-spring-boot-aka-spring-tool-suite-4)
* [git 2.20.1] (https://git-scm.com/downloads)

## Run Project and Examples

Checkout the Repository from Github localy and Import (Maven) Project into Eclipse. Start Tomcat and run (data is shown in JSON-Format)

* Call for Data of the Movie-Database (relized with org.json.simple.*)
```
http://localhost:8080/allMovies
http://localhost:8080/film?title=180
```

* Call for Data of the Emissions (relized with com.google.gson.*)
```
http://localhost:8080/allEmissions
http://localhost:8080/emission?sourceType=B20
```

## Helping Links

* [Movie-Database-Json-Elements-Description](https://dev.socrata.com/foundry/data.sfgov.org/wwmu-gmzc)
* [Emission-Json-Elements-Description](https://dev.socrata.com/foundry/data.sfgov.org/pxac-sadh)
* [simplest way to read json from a URL in java](https://stackoverflow.com/questions/4308554/simplest-way-to-read-json-from-a-url-in-java)
* [Loop Json array with gson](https://stackoverflow.com/questions/37427179/loop-json-array-with-gson)

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

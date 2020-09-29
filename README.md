## Micronaut JPA DEMO

Simple REST API demo using JDK 11 , Micronaut + JPA + H2 

* Sample POST Request 

```
curl --location --request POST 'http://localhost:8080/api/v1/book' \
--header 'Content-Type: application/json' \
--data-raw '{
  "title": "Bourne Identity",
  "author": "Robert Ludlum",
  "pages" : 376 
}'
```

* Sample GET Request

```
curl --location --request GET 'http://localhost:8080/api/v1/book'
```



### Feature Micronaut documentation

- [Micronaut Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

- [Micronaut Hibernate JPA documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#hibernate)

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

- [Micronaut Hibernate Validator documentation](https://micronaut-projects.github.io/micronaut-hibernate-validator/latest/guide/index.html)


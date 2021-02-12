# axon-service
A trivial axon based service to remember things I learned at my last employment before I forget them all

## Aims

The original service had the following features I'm trying to replicate.

- Uses CQRS with the axon framework for Event Sourcing
- Uses swagger codegen to generate an API ☑️
- Makes a swagger UI available for interacting with the API ☑️
- Uses a multi-module maven project with the api separate from the commands etc. ☑️
- Uses PostgreSQL persistence for the events database
- Uses MongoDB for the read model database 
- Uses different spring profiles so that the query

I may not achieve them the same way (I wish the original service was open-source so I could refer back to it) 
but instead I'll be relying on memory and online tutorials to try and achieve as similar a service as possible.

## To run

``` shell
mvn clean spring-boot:run
```

Browse to http://localhost:8080/ to view and use the embedded swagger UI
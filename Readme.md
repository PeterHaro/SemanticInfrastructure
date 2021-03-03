# Prebuild instructions

Due to the fact that we are deploying the semantic infrastructure as a set of microservices that relies on the ontotext
graphdb database for semantic data and SPARQL querying, we need to build and deploy the database first
The following steps needs to be taken before deployed to prod:

1. First we need to build the free edition (ontotext does not provide one through dockerhub or another registry)
2. Use the makefile as a helping tool to create the free edition and tie it to the compose file
   - make free VERSION=<version> ie. ```make free VERSION)9.6.0 ```
   - The built image will thus be ontotext/graphdb:9.6.0-free So that we can run the image stand alone with ```docker run -d -p 7200:7200 graphdb-free ``` 
3. Use the compose for the full deployment, and you can find most of the initialization in the preload folder. See the [GraphDB preload documentation](http://graphdb.ontotext.com/documentation/free/loading-data-using-preload.html) for more details.

   When running the preload docker-compose various parameters can be provided in the preload/.env file:
4. Build and run:
```   
docker-compose build
docker-compose up -d
```
> GraphDB data will go to `/data/graphdb`
> 
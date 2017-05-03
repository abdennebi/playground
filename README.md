# qb-20170502
Quarters Back May 2nd 2017 Demo

This demos shows how to self register a spring-boot application into Hashicorp Consul

## How to
1. First, download the [HashiCorp Consul](https://consul.io) 
2. run consul on your machine `$ consul agent -dev`
3. clone this repository
4. build all modules
5. run all modules `mvn spring-boot:run`
6. visit [consul UI](http://localhost:8500/ui)

you'll see aggregation-service, product-service and stock-service registred on consul

7. stop the product-service [CTRL][C]
8. into the product project, run 2 instances of the service using `./run1.sh` and `./run2.sh`
9. back to [consul UI](http://localhost:8500/ui)
10. click on `product-service` you'll notice 2 instance appearing under the same service name
11. `curl https://localhost:52000/client/products` returns list of products with their stock consuming 2 services

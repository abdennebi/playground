#!/usr/bin/env bash

PORT=30081

function run(){

    java -jar target/product-service.jar \
            --server.port=${PORT}
}

run

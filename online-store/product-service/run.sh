#!/usr/bin/env bash

PORT=52001

function run(){

    java -jar target/product-service.jar \
            --server.port=${PORT}
}

run

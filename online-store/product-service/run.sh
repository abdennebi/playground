#!/usr/bin/env bash

function run(){

    java -jar target/product-service.jar \
            --server.port=52001
}

run

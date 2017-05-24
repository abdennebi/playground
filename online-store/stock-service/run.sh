#!/usr/bin/env bash

PORT=52002

function run(){

    java -jar target/stock-service.jar \
            --server.port=${PORT}
}

run

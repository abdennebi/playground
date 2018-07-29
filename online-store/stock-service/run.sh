#!/usr/bin/env bash

PORT=30082

function run(){

    java -jar target/stock-service.jar \
            --server.port=${PORT}
}

run

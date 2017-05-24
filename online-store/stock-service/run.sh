#!/usr/bin/env bash

function run(){

    java -jar target/stock-service.jar \
            --server.port=52002
}

run

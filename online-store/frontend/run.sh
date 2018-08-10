#!/usr/bin/env bash

PRODUCT_URL=http://localhost:30081
STOCK_URL=http://localhost:30082
PORT=30080

function run(){

    java -jar target/frontend.jar \
            --frontend.product.url=${PRODUCT_URL} \
            --frontend.stock.url=${STOCK_URL} \
            --server.port=${PORT}
}

run

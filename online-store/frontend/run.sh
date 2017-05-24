#!/usr/bin/env bash

PRODUCT_URL=http://localhost:52001
STOCK_URL=http://localhost:52002

function run(){

    java -jar target/frontend.jar \
            --frontend.product.url=${PRODUCT_URL} \
            --frontend.stock.url={STOCK_URL} \
            --server.port=52000
}

run

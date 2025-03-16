#!/bin/sh

# Create DB
if [ "$1" = "create" ]; then
    docker-compose -f ./db/docker-compose.yml down -v
    docker-compose -f ./db/docker-compose.yml build --no-cache
    docker-compose -f ./db/docker-compose.yml up -d
    exit 0
fi  

# Start DB
if [ "$1" = "start" ]; then
    docker-compose -f ./db/docker-compose.yml up -d
    exit 0
fi

# Stop DB
if [ "$1" = "stop" ]; then
    docker-compose -f ./db/docker-compose.yml down
    exit 0
fi

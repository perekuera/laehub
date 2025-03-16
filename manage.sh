#!/bin/sh

# Start DB
if [ "$1" = "start" ]; then
    docker-compose -f ./db/docker-compose.yml up -d
    return 0
fi

# Stop DB
if [ "$1" = "stop" ]; then
    docker-compose -f ./db/docker-compose.yml down
    return 0
fi

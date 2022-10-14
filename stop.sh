#!/bin/bash
cd $(dirname $0)

if ! command -v docker-compose &> /dev/null
then
    docker compose stop
else
    docker-compose stop
fi

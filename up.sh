#!/bin/bash
cd $(dirname $0)

if ! command -v docker-compose &> /dev/null
then
    docker compose up -d
else
    docker-compose up -d # --build 
fi

#!/bin/bash

curl --location --request POST 'http://localhost:8180/kie-server/services/rest/server/containers/instances/Emilio_1.0.0-SNAPSHOT' \
-u kieserver:kieserver1! \
--header 'Content-Type: application/json' \
--data-raw '{
    "commands": [
        {
            "insert": {
                "object": {
                    "User": {
                        "id": 1,
                        "nombre": "Emilio",
                        "saldo": 2.0
                    }
                }
            }
        },
        {
            "insert": {
                "object": {
                    "User": {
                        "id": 2,
                        "nombre": "Pedrolo",
                        "saldo": -16.0
                    }
                }
            }
        },
        {
            "fire-all-rules": {
                "max": 10,
                "out-identifier": "firedActivations"
            }
        }
    ]
}'
        

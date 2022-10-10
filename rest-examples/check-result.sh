#!/bin/bash

curl --location --request POST 'http://localhost:8180/kie-server/services/rest/server/containers/instances/Test_1.0.0-SNAPSHOT' \
-u 'admin:admin' \
--header 'Content-Type: application/json' \
--data-raw '{
    "commands": [
        {
            "get-objects": {
                "out-identifier": "import"
            }
        }
    ]
}'

#!/bin/bash

echo "curl --location --request POST 'http://localhost:8180/kie-server/services/rest/server/containers/instances/Test_1.0.0-SNAPSHOT' \
-u 'admin:admin' \
--header 'Content-Type: application/json' \
--data-raw '{
   "commands": [                                                                                                                              [149/367]
        {
            "insert": {
                "object": {
                    "ImportProduct": {
                        "id": 1,
                        "category": "Games",
                        "price": 2.0,
                        "status": "OK"
                    }
                }
            }
        },
        {
            "insert": {
                "object": {
                    "ImportProduct": {
                        "id": 2,
                        "category": "Games",
                        "price": 4.0,
                        "status": "NOT_OK"
                    }
                }
            }
        },
        {
            "insert": {
                "object": {
                    "ImportProduct": {
                        "id": 3,
                        "category": "Games",
                        "price": 5.0,
                        "status": "OK"
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
}'"

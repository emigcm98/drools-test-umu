# DROOLS Kie Server + Business Central

:)

## Business Central

- At http://localhost:8080/business-central

## Kie Server

- REST API at http://localhost:8180/kie-server/services/rest/server/

## Execution Example

:(

### Test project

[TO DO]

### Running examples

In folder `rest-examples/` you can find a few scripts to check that project 'Test' works properly. The execution runs as follows:

- Run `./list-containers.py` to check that the Application 'Test' has been sent to Kie Server from Business Central. The response should be:

```{json}
{
    "type": "SUCCESS",
    "msg": "List of created containers",
    "result": {
        "kie-containers": {
            "kie-container": [
                {
                    "container-id": "Test_1.0.0-SNAPSHOT",
                    "release-id": {
                        "group-id": "com.myspace",
                        "artifact-id": "Test",
                        "version": "1.0.0-SNAPSHOT"
                    },
                    "resolved-release-id": {
                        "group-id": "com.myspace",
                        "artifact-id": "Test",
                        "version": "1.0.0-SNAPSHOT"
                    },
                    "status": "STARTED",
                    "scanner": {
                        "status": "DISPOSED",
                        "poll-interval": null
                    },
                    "config-items": [],
                    "messages": [
                        {
                            "severity": "INFO",
                            "timestamp": {
                                "java.util.Date": 1665390160878
                            },
                            "content": [
                                "Container Test_1.0.0-SNAPSHOT successfully created with module com.myspace:Test:1.0.0-SNAPSHOT."
                            ]
                        }
                    ],
                    "container-alias": "Test"
                }
            ]
        }
    }
}
```

- Run `./send-objects.sh` to send business object in real-time to the deployed Application 'Test'. The response should be:

```{json}
{
  "type" : "SUCCESS",
  "msg" : "Container Test_1.0.0-SNAPSHOT successfully called.",
  "result" : {
    "execution-results" : {
      "results" : [ {
        "value" : 2,
        "key" : "firedActivations"
      } ],
      "facts" : [ ]
    }
  }
}
```

- Run `./check-result.sh` to see the results of applied rules. The response should be:


```{json}
{
  "type" : "SUCCESS",
  "msg" : "Container Test_1.0.0-SNAPSHOT successfully called.",
  "result" : {
    "execution-results" : {
      "results" : [ {
        "value" : [{"com.myspace.test.ImportProduct":{
  "id" : "1",
  "category" : "Games",
  "status" : "OK",
  "price" : 2.0
}},{"com.myspace.test.ImportProduct":{
  "id" : "3",
  "category" : "Games",
  "status" : "OK",
  "price" : 5.0
}}],
        "key" : "import"
      } ],
      "facts" : [ ]
    }
  }
}
```

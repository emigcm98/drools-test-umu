#!python

# curl -u 'admin:admin' -H "Accept: application/json" -X GET "http://localhost:8080/kie-server/services/rest/server/containers"

import requests
from requests.auth import HTTPBasicAuth
import json

host = "http://localhost:8180"
#host = "http://192.168.7.3:8080"

def send_request():

    auth = HTTPBasicAuth('admin', 'admin')
    headers = {
        "Accept" : "application/json"
    }

    response = requests.get(host + "/kie-server/services/rest/server/containers", auth=auth, headers = headers)

    print(json.dumps(response.json(), indent=4))

if __name__ == "__main__":
    send_request()

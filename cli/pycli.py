#!python3

import requests
from requests.auth import HTTPBasicAuth
import json
import argparse

CONF_PATH="config.json"


def load_conf():
    with open(CONF_PATH) as f:
        global conf, url
        conf = json.load(f)
        url = f"http://{conf['KIE_SERVER_HOST']}:{conf['KIE_SERVER_PORT']}/{conf['KIE_SERVER_NAMESPACE']}"

def parse_args():
    parser = argparse.ArgumentParser(description='Process some integers.')
    parser.add_argument('-l', '--listContainers', help='List containers', action="store_true")
    args = parser.parse_args()
    if args.listContainers:
        list_containers()


def list_containers():
    make_request("GET", "/services/rest/server/containers", None)


def make_request(method: str, url_request, data):

    headers = {
        "Accept": "application/json",
        #"Content-Type": "apllication/json; charset=utf-8",
        #"Authorization": "Basic {auth_b64}"
    }

    if method.lower() == "get":
        print(url + url_request)
        response = requests.get(url + url_request, headers=headers, auth=HTTPBasicAuth(conf['KIE_SERVER_USER'], conf['KIE_SERVER_PWD']))
        print(response)
        response = json.dumps(response.json(), indent=4)
        print(response)


def main():
    load_conf()
    parse_args()
    print(url)


if __name__ == "__main__":
    main()

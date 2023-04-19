#!/bin/bash

# Set variables
API_URL="https://api.example.com"
API_KEY="my-api-key"
USER_AGENT="MyApp/1.0"

# Make a GET request with API key and user agent
curl -X GET -H "X-API-KEY: $API_KEY" -H "User-Agent: $USER_AGENT" $API_URL

# Make a POST request with API key and user agent
curl -X POST -H "X-API-KEY: $API_KEY" -H "User-Agent: $USER_AGENT" -d "param1=value1&param2=value2" $API_URL

# Make a DELETE request with HTTPS encryption, API key, and user agent
curl -X DELETE -H "X-API-KEY: $API_KEY" -H "User-Agent: $USER_AGENT" --cacert /path/to/cert.pem --cert /path/to/client.pem --key /path/to/key.pem $API_URL

import requests

response = requests.get('https://api.example.com/users', verify=True)

# verify=True parameter is used to enable SSL verification

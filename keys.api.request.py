import requests

headers = {
    'API-KEY': 'YOUR_API_KEY'
}

response = requests.get('https://api.example.com/users', headers=headers)

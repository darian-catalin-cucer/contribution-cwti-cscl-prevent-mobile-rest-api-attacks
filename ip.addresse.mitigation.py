import requests

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3',
}

data = {
    'username': 'user1',
    'password': 'password1',
    'captcha': '12345',
    'ip_address': '127.0.0.1'
}

response = requests.post('https://api.example.com/login', headers=headers, data=data)

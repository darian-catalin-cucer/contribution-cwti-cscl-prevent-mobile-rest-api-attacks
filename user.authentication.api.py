from flask import Flask, jsonify, request, abort
from flask_httpauth import HTTPTokenAuth

app = Flask(__name__)
auth = HTTPTokenAuth(scheme='Bearer')

tokens = {
    'SECRET_TOKEN': 'user1'
}

@auth.verify_token
def verify_token(token):
    if token in tokens:
        return tokens[token]

@app.route('/users', methods=['GET'])
@auth.login_required
def get_users():
    return jsonify({'users': ['user1', 'user2', 'user3']})

if __name__ == '__main__':
    app.run(debug=True)

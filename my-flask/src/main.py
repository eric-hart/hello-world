from flask import Flask

import json

app = Flask(__name__)

@app.route("/", methods=['GET'])
def index():
  return "index"

@app.route("/greeting", methods=['GET'])
def greeting_default():
  response = { 'content': 'Hello World!' }
  return json.dumps(response)

@app.route("/greeting/<name>", methods=['GET', 'POST'])
def greeting_with_name(name):
  response = { "content": "Hello %s!" %name }
  return json.dumps(response)

if __name__ == "__main__":
  app.run()

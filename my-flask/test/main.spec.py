import unittest

import requests

import json

class TestFlaskApplication(unittest.TestCase):

  def test_index(self):
    response = requests.get('http://localhost:5000/')
    self.assertEqual(response.text, 'index')

  def test_greeting_default(self):
    response = requests.get('http://localhost:5000/greeting')
    self.assertEqual(response.text, json.dumps({ 'content': 'Hello World!' }))

  def test_greeting_with_name(self):
    response = requests.get('http://localhost:5000/greeting/jack')
    self.assertEqual(response.text, json.dumps({ 'content': 'Hello jack!' }))

if __name__ == '__main__':
  unittest.main()

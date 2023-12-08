from flask import Flask
import time

app = Flask(__name__)   

@app.route('/')
def main():
    time.sleep(100)
    return 'Hello World!'

if __name__ == '__main__':
    app.run(debug=True)
from flask import Flask, render_template, request, redirect
app = Flask(__name__)

# http://picamhq:8080/?action=stream : video stream link

@app.route('/')
def hello_world():
    return render_template('base.html')
if(__name__ == "__main__"):
    app.run(debug=True)
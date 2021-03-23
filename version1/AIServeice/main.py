from flask import Flask, request
import qaModel
from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer
import json
import Recommended
import difflib

app = Flask(__name__)


@app.route("/")
def index():
    return "<h1> hello world </h1>"


@app.route("/search", methods=["GET", "POST"])
def search():
    question = request.args.get("question")
    if question:
        my_bot = ChatBot("apioss", read_only=True)
        resultContent = my_bot.get_response(question)

        resultContent = str(resultContent)

        qid, searchQuestion, searchResult, views, useful = "", "", "", 0, 0

        docTextList = []
        allData = qaModel.getAllQa()
        for eve in allData:
            if difflib.SequenceMatcher(None, eve[2], resultContent).quick_ratio() < 0.9:
                docTextList.append((eve[0], eve[1]))
            else:
                qid = eve[0]
                searchQuestion = eve[1]
                searchResult = eve[2]
                views = eve[3]
                useful = eve[4]

        listData = Recommended.RecommendedHandle(numCount=3).getArticleList(question, docTextList)
        resultList = []

        for qa in allData:
            for eve in listData:
                if qa[0] == eve:
                    resultList.append(qa)

        resultData = {
            "result": {
                "qid": qid,
                "question": searchQuestion,
                "answer": searchResult,
                "views": views,
                "useful": useful
            },
            "recommend": [

            ]
        }

        for res in resultList:
            resultData["recommend"].append(
                {
                    "qid": res[0],
                    "question": res[1],
                    "answer": res[2],
                    "views": res[3],
                    "useful": res[4]
                }
            )

        return json.dumps(resultData)


@app.route("/trans", methods=["GET", "POST"])
def trans():
    try:
        my_bot = ChatBot("apioss")
        my_bot.set_trainer(ListTrainer)

        for qa in qaModel.getAllQa():
            my_bot.train([
                qa[1],
                qa[2]
            ])
        result = {
            "code": "0",
            "message": "success"
        }
    except Exception as e:
        result = {
            "code": "-1",
            "message": str(e)
        }

    return json.dumps(result)


if __name__ == "__main__":
    app.run(port=8000)

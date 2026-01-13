import requests
num = int(input("How many jokes would you like "))
for o in range(0,num):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
    print(joke["setup"])
    print(joke["delivery"])
    print()

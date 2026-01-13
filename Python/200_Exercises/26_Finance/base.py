#Run "pip install yfinance" in a terminal

import yfinance as yf


thelist = ["TSLA", "GOOGL", "TGT", "^IXIC", "AMZN", "SEMR", "ABEV", "SOFI", "AAL", "NVDA"]
for x in range(0,9):
    stock = yf.Ticker(thelist[x])
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info

    print(info["longName"])
    print(thelist[x] + " Current Price:", current_price)


hive = input("Do you have your own ")
stock = yf.Ticker(hive)
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

print(info["longName"])
print(info["website"])
print(str(hive) + " Current Price:", current_price)
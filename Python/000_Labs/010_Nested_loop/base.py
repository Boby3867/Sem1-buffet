symbol = input("What symbol would you like to use? ")
y = int(input("What’s the width of your box? "))
x = int(input("What’s the height of your box?  "))
for o in range(0,x):
    print()
    for t in range(0,y):
        print(end=symbol)
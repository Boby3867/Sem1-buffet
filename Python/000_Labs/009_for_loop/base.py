x = int(input("Please enter line length: "))
y = input("Do you want a horizontal or vertical line? ")
if y == "vertical":
    for t in range(0,+ x):
        print("|")
        print(t)
elif y == "horizontal":
    for t in range(0,+ x):
        print(end="_")
else:
    print("NOOOOOOOOOOOOOOOOOOOO")
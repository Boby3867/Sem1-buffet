x = int(input(" please enter a number: "))
i = 1
for o in range(0,x):
    i = o + i
    print(end=str(o))
    print(end=" + ")
print(x)
i = x + i
print("The sum of 1 to " + str(x) + " is: " + str(i))
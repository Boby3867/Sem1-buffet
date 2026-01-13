a = int(input("enter a number: "))
b = int(input("enter a another number: "))
c = int(input("enter a another number: "))
if a > b and a > c:
    print("the largest number of the three was: " + str(a))
elif b > a and b > c:
    print("the largest number of the three was: " + str(b))
else:
    print("the largest number of the three was: " + str(c))

thelist = ["this", "will", "be", "the", "coolest", "sentence", "Yahoo"]
print("This will be the coolest sentence Yahoo")
i = 5
print("")
print("Now watch it spelled backwards")
for t in range(0,7):
    print(end=thelist[i])
    print(end=" ")
    i = i - 1
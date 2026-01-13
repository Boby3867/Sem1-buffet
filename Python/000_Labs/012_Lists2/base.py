import random
x = int(input("How many random numbers would you like? "))
thelist = [4, 6, 2, 1, 10, 7, 3, 9, 8, 5]
for o in range(0,x):
    poop = (random.randrange(10))
    print(thelist[poop])
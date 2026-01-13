x = int(input("Please enter a number: "))
wow = input("Please enter an operation: ")
y = int(input("Please enter another number: "))
if wow == "+":
    print(x + y)
elif wow == "-":
    print(x - y)
elif wow == "*":
    print(x * y)
elif wow == "/":
    print(x / y)
else:
    print("IT the wrong operation")
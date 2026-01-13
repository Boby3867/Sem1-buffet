year = int(input("what year would you like to check "))
if year % 400 == 0:
    print(str(year) + " is a leap year")
elif year % 100 == 0:
    print(str(year) + " is a not leap year")
elif year % 4 == 0:
    print(str(year) + " is a leap year")
else:
    print(str(year) + " is a not leap year")
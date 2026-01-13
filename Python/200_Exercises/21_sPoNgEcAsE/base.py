str = input("What dumb thing did they say ")

# A String variable can be made upper or lower case given the following methods
# These commands turn the entire String to upper or lower case and stores it back in str
# The following loop goes through each letter in str one by one. 
# char becomes each letter for each loop!
i = 1
for char in str:
    i = i + 1
    if i % 2 == 0:
        char = char.lower()
        print(end=char)
    else:
        char = char.upper()
        print(end=char)
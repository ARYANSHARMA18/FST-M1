numbers = tuple(input("Enter the numbers : ").split(","))

for num in numbers :
    if(int(num) % 5 == 0) : 
        print(num)
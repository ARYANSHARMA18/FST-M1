def calculateSum(numbers) :
    sum = 0
    for num in numbers : 
        sum += int(num)

    return sum
    



numbers = input("Enter the numbers : ").split(",")

res = calculateSum(numbers)
print("The calculated sum of elements is: " , res)



number = input("Enter list of numbers : ").split(",")
sum=0

for i in number  :
    sum += int(i)

print("Sum of numbers is :", sum)
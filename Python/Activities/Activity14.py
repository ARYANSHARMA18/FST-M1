def finobacci_numbers(n) :
    if(n == 0) :
        return 0
    
    if(n == 1) : 
        return 1
    
    return finobacci_numbers(n-1) + finobacci_numbers(n-2)
    

number = int(input("Enter the number : "))
res = finobacci_numbers(number)
print("Fibonnaci number of " + str(number) + "th index is : " , res)
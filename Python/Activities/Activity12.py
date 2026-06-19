def calculateSum(n) : 
    if(n == 0) :
        return 0
    return n + calculateSum(n-1);


print("The sum of number upto 10 is: ", calculateSum(10))
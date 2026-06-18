fruits = {
    "apple" : 10,
    "mango" : 50,
    "banana" : 25,
    "orange" : 15
}

fruit_available = input("Enter the fruits you wanna buy : ").lower()

if(fruit_available in fruits) :
    print("Hurray! it's available")
else :
    print("Sorry, it's unavailable")
class Car:
    'This is a Car blueprint class'
    
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelator(self) :
        print(self.manufacturer , self.model , " is moving")

    def stop(self) :
        print(self.manufacturer , self.model , " has stopped")


car1 = Car("Toyota", "Camry", 2024, "Automatic", "White")
car2 = Car("Honda", "Civic", 2023, "Manual", "Black")
car3 = Car("Tesla", "Model 3", 2025, "Automatic", "Red")

car1.accelator()
car2.stop()
car3.accelator()
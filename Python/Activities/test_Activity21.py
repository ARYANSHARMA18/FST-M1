import pytest

def test_addition() :
    num1 = 10
    num2 = 20

    sum = num1 + num2 

    assert sum == 30

def test_subtraction() :
    num1 = 10
    num2 = 20

    diff = num2 - num1 

    assert diff == 10

def test_multiplication() :
    num1 = 10
    num2 = 20 

    mul = num1 * num2 

    assert mul == 200

def test_division() : 
    num1 = 10
    num2 = 20
    
    div = num2/num1

    assert div == 2

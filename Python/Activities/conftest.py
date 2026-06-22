import pytest 

@pytest.fixture
def num_list() :
    numbers = [0,1,2,3,4,5,6,7,8,9,10]
    return numbers

@pytest.fixture
def wallet() :
    amount = 0
    return amount
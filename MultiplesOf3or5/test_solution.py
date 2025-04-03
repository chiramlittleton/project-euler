from solution import sum_of_multiples_of_3or5

def test_sum_under_10():
    assert sum_of_multiples_of_3or5(10) == 23  # 3 + 5 + 6 + 9

def test_sum_under_1():
    assert sum_of_multiples_of_3or5(1) == 0

def test_sum_under_16():
    assert sum_of_multiples_of_3or5(16) == 60  # 3 + 5 + 6 + 9 + 10 + 12 + 15

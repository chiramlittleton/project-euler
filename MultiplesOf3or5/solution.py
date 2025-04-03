from itertools import accumulate


def sum_of_multiples_of_3or5(limit):
    return sum([x for x in range(limit) if x % 3 == 0 or x % 5 == 0])

if __name__ == "__main__":
    limit = 1000
    print(sum_of_multiples_of_3or5(limit))
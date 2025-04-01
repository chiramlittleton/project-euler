package main

import "fmt"

func sumOfMultiplesOf3or5(limit int) int {
	sum := 0

	for i := 0; i < limit; i++ {
		if i%3 == 0 || i%5 == 0 {
			sum += i
		}
	}
	return sum
}

func main() {
	fmt.Println(sumOfMultiplesOf3or5(1000))
}

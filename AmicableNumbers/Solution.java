import java.util.*;

public class Solution {

    public static void main(String[] args){
        System.out.println(sumOfAmicableNumbers(10000));
    }

    private static int sumOfAmicableNumbers(int limit){
        // For each number, calculate the sum of divisors, then calculate the sum of divisors for that number
        Set<Integer> amicableNumbers = new HashSet<>();

        for(int a = 1; a < limit; a++){
            int b = sumOfDivisors(a);
            int dB = sumOfDivisors(b);

            if(a != b && dB == a){
                amicableNumbers.add(a);
                amicableNumbers.add(b);
            }
        }

        return amicableNumbers.stream()
                                .mapToInt(Integer::intValue)
                                .sum();
    }

    private static int sumOfDivisors(int num){
        Set<Integer> divisors = new HashSet<>();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                divisors.add(i);
            }
        }

        int sum = 0;
        for(Integer n : divisors){
            sum += n;
        }
        return sum;
    }
}
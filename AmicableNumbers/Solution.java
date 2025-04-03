import java.util.*;

public class Solution {

    public static void main(String[] args){
        System.out.println(sumOfAmicableNumbers(10000));
    }

    private static int sumOfAmicableNumbers(int limit){
        int[] sumOfDivisors = new int[limit];
        // fill array with divisors
        for(int i = 0; i < limit; i++){
            sumOfDivisors[i] = sumOfDivisors(i);
        }

        // Iterate through array checking for amicable numbers
        Set<Integer> amicableNumbers = new HashSet<>();
        for(int i = 0; i<limit; i++){
            int potentialPairA = sumOfDivisors[i];
            if(potentialPairA < limit){
                int potentialPairB = sumOfDivisors[potentialPairA];
                if(i == 220){
                    System.out.println(potentialPairA +" "+potentialPairB);
                }
                if(potentialPairB == i){
                    amicableNumbers.add(potentialPairA);
                    amicableNumbers.add(potentialPairB);
                }
            }
        }

        int sum = 0;
        for(Integer num : amicableNumbers){
            sum += num;
        }
        return sum;
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
import java.util.*;

public class Solution {
    public static void main(String[] args){
        System.out.println(sumEvenFibonacciNumbers(10));
    }

    private static long sumEvenFibonacciNumbers(int limit){
        long sum = 0;

        List<Long> fibNumbers = getFibonacciSequence(limit);
        for(long fibNumber : fibNumbers){
            if(fibNumber % 2 == 0){
                sum += fibNumber;
            }
        }
        return sum;
    }

    private static List<Long> getFibonacciSequence(int limit){
        // f(x) = f(x-1) - f(x-2)
        List<Long> sequence = new ArrayList<>();
        for(int i = 0; i < limit; i++){
            sequence.add(helper(i, sequence));
        }

        return sequence;
    }

    private static long helper(long x, List<Long> sequence){
        if(x == 0){
            return 0;
        }

        if(x == 1){
            return 1;
        }

        return sequence.get((int)x-1) + sequence.get((int)x-2);
    }
}

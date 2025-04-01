
public class Solution {
    public static void main(String[] args){
        int limit = 1000;

        System.out.println("Sum of all the multiples of 3 or 5 below "+limit+": "+sumOfMultiplesOf3or5(limit));
    }

    private static int sumOfMultiplesOf3or5(int limit){
        int sum = 0;

        for(int i=0; i<limit; i++){
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
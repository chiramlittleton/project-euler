import java.util.*;

public class Solution {
    public static void main(String[] args){
        System.out.println(largestPalindrome());
    }

    private static int largestPalindrome(){
        int largestPalindrome = 101;
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++){
                int num = i * j;
                if(num > largestPalindrome && isPalindrome(num)){
                    largestPalindrome = num;
                }
            }
        }

        return largestPalindrome;
    }

    private static boolean isPalindrome(int num){
        String numString = Integer.toString(num);
        return numString.equals(new StringBuffer(numString).reverse().toString());
    }
}

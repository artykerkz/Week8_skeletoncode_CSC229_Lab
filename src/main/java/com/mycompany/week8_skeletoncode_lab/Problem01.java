/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    long sum = 0;
    
    for (int i = 2; i <= n; i++) {
        boolean isPrime = true;
        
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            sum += i;
        }
    }
    return sum;
    
    }
    
    public static void main(String[] args) {
        int n = 19;
        long result = getSumOfPrimes(n);
        System.out.println("Sum of prime numbers between 1 and " + n + " = " + result);
    }
}


/* 
Time complexity: O(n * sqrt n) because the first loop runs n times and the second runs sqrt n times. 
Space complexity: O(1) because only some extra variables are used, so the memory doesn't grow.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    
    return -1;
        
    }
public static void main(String[] args) {
    int[] numbers = {3, 0, 5, 8, 6, 9, 1, 7, 2, 4};
    int key = 3;
    
    int result = search(numbers, key);
    
    if (result == -1) {
        System.out.println("Key not found"); 
    } else {
        System.out.println("Key " + key + " found at index: " + result);
    }
}    
    
}

/*
Asymptotic analysis:
best case: O(1) if the key is in the first element.
worst case: O(n) if the key is in the last element or doesn't exist.
average case: O(n) since about half of the numbers get checked on average.
*/

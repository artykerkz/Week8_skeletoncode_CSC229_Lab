/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
public static void main(String[] args) {
    int [] sortedArray = {3, 5, 9, 13, 18, 23, 27, 29, 32};
    int key = 13;

    int result = runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1); 

    if (result == Integer.MAX_VALUE) {
        System.out.println("Key not found"); 
    } else {
        System.out.println("Key: " + key + " found at index: " + result);
    }
}
}

/*
Time complexity: O(log n) because it grows logarithmically each time. 
Space complexity: O(1) because it needs a constant amount of extra memory regardless of array size.
*/


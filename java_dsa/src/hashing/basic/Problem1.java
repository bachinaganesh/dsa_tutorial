package hashing.basic;

import java.util.HashMap;

/**
 * Find the most frequency element
 * If more than one element have same frequency then return the smallest element
 */

public class Problem1 {
    public static int findMostFRequencyElement(int[] nums) {
        HashMap<Integer, Integer> mostFrequency = new HashMap<>();
        int maxElement = Integer.MIN_VALUE;
        int frequency = 0;
        for(int num: nums) {
            mostFrequency.put(num, mostFrequency.getOrDefault(num, 0)+1);
            if(mostFrequency.get(num) > frequency) {
                frequency = mostFrequency.get(num);
                maxElement = num;
            }
            else if(mostFrequency.get(num) == frequency) {
                if(num < maxElement) {
                    maxElement = num;
                }
            }
        }
        return maxElement;

    }
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 2, 5, 6, 2, 3, 2};
        System.out.println(findMostFRequencyElement(nums));

    }
}

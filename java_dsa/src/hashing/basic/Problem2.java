package hashing.basic;

import java.util.HashMap;

/**
 * Find the second highest frequency element
 * If two elements have same frequency then return smallest one
 */

public class Problem2 {
    public static int findSecondFrequencyElement1(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int number: nums) {
            frequencies.put(number, frequencies.getOrDefault(number, 0)+1);
        }
        int firstFreq=0, secondFreq = 0;
        int firstElement=Integer.MIN_VALUE, secondElement = Integer.MIN_VALUE;
        for(Integer key: frequencies.keySet()) {
            int currentFreq = frequencies.get(key);

            if(firstElement == Integer.MIN_VALUE) {
                firstElement = key;
                firstFreq = frequencies.get(key);
            }
            else if (currentFreq == firstFreq) {
                if (key < firstElement) {
                    firstElement = key;
                }
            }
            else if(currentFreq > firstFreq) {
                secondFreq = firstFreq;
                secondElement = firstElement;
                firstFreq = currentFreq;
                firstElement = key;
            }
            else if(currentFreq == secondFreq) {
                if(key < secondElement) {
                    secondElement = key;
                }
            }
            else if(currentFreq > secondFreq) {
                secondFreq = currentFreq;
                secondElement = key;
            } 
                
        }
        return secondElement!=Integer.MIN_VALUE?secondElement:-1;
    }


    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};
        System.out.println(findSecondFrequencyElement1(nums));
    }
}

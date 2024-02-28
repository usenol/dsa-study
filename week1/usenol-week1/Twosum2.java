//Umut Şenol - LeetCode 167

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */

import java.util.Arrays;

public class Twosum2 {
        public int[] twoSum(int[] numbers, int target) {
            int new_arr[] = new int[2];
            int left = 0, right = numbers.length-1, sum, middle;
            while(left < right){
                sum = numbers[left] + numbers[right];
                middle = (left + right)/2;
                if(sum == target){
                    new_arr[0] = left+1;
                    new_arr[1] = right+1;
                    return new_arr;
                }
                else if (sum < target){
                    if(numbers[right] + numbers[middle] < target) { left = middle+1; }
                    else { left++; }
                } else {
                    if(numbers[left] + numbers[middle] > target) { right = middle-1; }
                    else { right--; }
                }
            }
            return new_arr;
        }
    public static void main(String[] args) {
        Twosum2 twosum = new Twosum2();
        //Test Case 1:
        int numbers[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twosum.twoSum(numbers,target)));
        //Test Case 2:
        int numbers2[] = {2,3,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twosum.twoSum(numbers2,target2)));
        //Test Case 3:
        int numbers3[] = {-1,0};
        int target3 = -1;
        System.out.println(Arrays.toString(twosum.twoSum(numbers3,target3)));

    }
}

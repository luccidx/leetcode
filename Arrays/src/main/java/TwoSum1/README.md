# 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.<br>
You may assume that each input would have exactly one solution, and you may not use the same element twice.<br>
You can return the answer in any order.<br>

- Example 1:
>Input: nums = [2,7,11,15], target = 9<br>
Output: [0,1]<br>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
- Example 2:

>Input: nums = [3,2,4], target = 6 <br>
Output: [1,2]
- Example 3:

>Input: nums = [3,3], target = 6<br>
Output: [0,1]


- Constraints:

`2 <= nums.length <= 104`
`-109 <= nums[i] <= 109`
`-109 <= target <= 109`
**Only one valid answer exists.**

---
# Intuition
- The problem is to find the indices of two numbers that add up to a target number.
- We can solve this problem using a brute-force approach, but it will take O(n^2) time complexity.
- The method is to iterate through the array and check if the sum of the current element and the next element is equal to the target number.
- If the sum is equal to the target number, we return the indices of the two numbers.
- But this approach is not efficient, so we can use a hashmap to solve this problem in O(n) time complexity.
- We can store the difference between the target number and the current element in the hashmap.
- If the difference is already present in the hashmap, we return the indices of the two numbers.
- Otherwise, we store the current element in the hashmap and continue the iteration.
- This approach will reduce the time complexity to O(n) and solve the problem efficiently.

below is the code using Brute force and Hashmap approach:

```java
//Brute Force
public int[] twoSum(int[] nums, int target) {
    for (int i=0; i<nums.length; i++){
        for (int j=i+1; j<nums.length; j++){
            if( nums[i] + nums[j] == target){
                return new int[] {i, j};
            }
        }
    }
    return nums;
}
```
### Time Complexity
- **O(n^2)**: The method uses a nested loop to iterate through the array, resulting in a quadratic time complexity. Here, `n` is the number of elements in the array.

### Space Complexity
- **O(1)**: The method uses a constant amount of extra space, as it only stores a few integer variables and the result array, which does not scale with the input size.
```java
// Hashmap
public int[] twoSumHashmap(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
```
### Time Complexity
- **O(n)**: The method uses a hashmap, resulting in a linear time complexity. Here, `n` is the number of elements in the array.

### Space Complexity
- **O(1)**: The method uses a constant amount of extra space, as it only stores a few integer variables and the result array, which does not scale with the input size.
```java
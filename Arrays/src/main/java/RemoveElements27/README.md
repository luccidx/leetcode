# 27. Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
## Intuition

The problem requires removing all instances of a given value from an array in-place. The challenge is to do this with minimal additional space and in linear time. The solution should ensure that the remaining elements are in the correct order up to the new length of the array.

## Approach

The solution involves the following steps:

1. **Swap Function**:
   - A helper function `swap` is used to swap elements in the array.

2. **Alternative Method**:
   - An alternative method `removeElement2` is provided, which uses a single pointer to overwrite elements that are not equal to `val`.

## Solution

1st Approach
```java
private static int removeElement(int[] nums, int val) {
    int bound = nums.length-1;
    int i = 0;
    while (i <= bound) {
        if (nums[i] == val) {
            swap(nums, i, bound);
            bound -= 1;
        } else {
            i += 1;
        }
    }
    return i;
}

private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
```

2nd Approach
```java
public int removeElement2(int[] nums, int val) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
}
```

# 1299. Replace Elements with Greatest Element on Right Side

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
<br>
After doing so, return the array.


- Example 1:

>Input: arr = [17,18,5,4,6,1]<br>
>Output: [18,6,6,6,1,-1]<br>
>Explanation:<br>
>- index 0 --> the greatest element to the right of index 0 is index 1 (18).<br>
>- index 1 --> the greatest element to the right of index 1 is index 4 (6).<br>
>- index 2 --> the greatest element to the right of index 2 is index 4 (6).<br>
>- index 3 --> the greatest element to the right of index 3 is index 4 (6).<br>
>- index 4 --> the greatest element to the right of index 4 is index 5 (1).<br>
>- index 5 --> there are no elements to the right of index 5, so we put -1.<br>

- Example 2:

>Input: arr = [400]<br>
>Output: [-1]<br>
>Explanation: There are no elements to the right of index 0.<br>


- Constraints:<br>
`1 <= arr.length <= 104`<br>
`1 <= arr[i] <= 105`
---

## Intuition 
- We can solve this problem by iterating the array from right to left and keeping track of the maximum element found so far.
- We will replace the current element with the maximum element found so far and update the maximum element found so far if the current element is greater than the maximum element found so far.
- We will replace the last element with -1 as there are no elements to the right of the last element.
- We will return the updated array.
- The time complexity of this approach is O(N) where N is the number of elements in the array.
- The space complexity of this approach is O(1).
- This approach is optimal and does not require any extra space.
- We can also solve this problem using a stack but that will require extra space and the time complexity will be O(N) where N is the number of elements in the array.
- The space complexity of the stack-based approach will be O(N) where N is the number of elements in the array.
- The stack-based approach is not optimal and requires extra space.

---
## Implementation
- We will initialize the maximum element found so far as -1.
- We will iterate the array from right to left.
- For each element, we will replace the current element with the maximum element found so far.
- We will update the maximum element found so far if the current element is greater than the maximum element found so far.
- We will replace the last element with -1.
- We will return the updated array.

```java
private static int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int N = arr.length;
        
        for (int i = N - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, temp);
        }
        return arr;
    }
```

---

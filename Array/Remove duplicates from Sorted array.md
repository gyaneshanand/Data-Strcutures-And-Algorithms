# Remove duplicates from Sorted array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


## Solution 1 - Bruteforce

- Iterate over the elements of the array.
- Put all the elements into a TreeSet
- Now iterate over the Treeset and put the elemnts back into the input array in first K positions


> __Time Complexity__ O(N)
> 
> __Space Complexity__ O(N)


## Solution 2

Two pointer Approach


```java
 public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;

        int x = 0;

        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                x++;
                nums[x] = nums[i];
                k++;
            }
        }
        return k;
    }
```

> __Time Complexity__ O(N)
> 
> __Space Complexity__ O(1)


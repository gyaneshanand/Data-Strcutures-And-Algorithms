# Rotate Array K times

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


## Solution 1 - Bruteforce

- Iterate over the elements of the array.
- Put all the elements into a TreeSet
- Now iterate over the Treeset and put the elemnts back into the input array in first K positions


> __Time Complexity__ O(N)
> 
> __Space Complexity__ O(N)


## Solution 2 : N Square Approach

Shuffle each element

TLE -> As the constraint was 1 <= nums.length <= 10^5


```java
 public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        for(int i=0; i<k; i++)
        {
            int t = nums[n-1];
            for(int j=n-1; j>0; j--)
            {
                nums[j]=nums[j-1];
            }
            nums[0]=t;
        }
    }
```

> __Time Complexity__ O(N^2)
> 
> __Space Complexity__ O(1)


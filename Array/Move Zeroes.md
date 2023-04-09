# Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

https://leetcode.com/problems/move-zeroes/ 

<img width="697" alt="image" src="https://user-images.githubusercontent.com/21087112/230757659-1fd36698-c0d0-4898-adc0-5a8bda772a20.png">


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


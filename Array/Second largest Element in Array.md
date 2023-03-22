# Second largest Element in Array

Given an array Arr of size N, print second largest distinct element from an array.

https://practice.geeksforgeeks.org/problems/second-largest3735/1

## Solution 1

### Bruteforce

Using sorting

```java 
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int maxn = arr[0];
        
        for(int i=0;i<n; i++) {
            if(arr[i]>maxn) {
                maxn = arr[i];
            }
        }
        
        int smaxn = -1;
        
        for(int i=0;i<n; i++) {
            if(arr[i]>smaxn && arr[i]<maxn) {
                smaxn = arr[i];
            }
        }
        return smaxn;
    }
}
```

## Solution 2

### Using two loops

```java 
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int maxn = arr[0];
        
        for(int i=0;i<n; i++) {
            if(arr[i]>maxn) {
                maxn = arr[i];
            }
        }
        
        int smaxn = -1;
        
        for(int i=0;i<n; i++) {
            if(arr[i]>smaxn && arr[i]<maxn) {
                smaxn = arr[i];
            }
        }
        return smaxn;
    }
}
```

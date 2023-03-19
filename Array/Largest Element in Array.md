# Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.


## Solution 1

Sort the Array. And return the last element as the largest element.


```java
class Compute {
    
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
```


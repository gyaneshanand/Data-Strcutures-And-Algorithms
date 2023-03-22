# Second largest Element in Array


## Solution 1

Using two loops

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

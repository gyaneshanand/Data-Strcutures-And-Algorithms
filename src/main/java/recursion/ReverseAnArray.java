package recursion;

import java.util.Arrays;

public class ReverseAnArray {

    static int[] arr;

    public static void reverse(int l, int r){
        if(l>=r)
            return;
        swap(l,r);
        reverse(l+1, r-1);
    }

    public static void reverse(int i){
        if(i>=arr.length/2)
            return;
        swap(i, arr.length-1-i);
        reverse(i+1);
    }

    private static void swap(int l, int r){
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void main(String[] args) {
        arr = new int[]{1, 2, 3, 4};
        for(int a : arr) {
            System.out.println(a);
        }
        //Arrays.stream(arr).forEach(System.out::print);
        reverse(0);
        //Arrays.stream(arr).forEach(System.out::print);
        for(int a : arr) {
            System.out.println(a);
        }
    }
}

package Recursion.basicRecursion;

public class PrintName5Times {

    static void printName(int count) {
        if(count > 5)
            return;
        System.out.println("Gyanesh");
        printName(count+1);
    }

    public static void main(String[] args) {
        printName(1);
    }
}

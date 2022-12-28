package recursion.intro;

public class StackOverflowInRecursion {

    public static void func(int i) {

        System.out.println(i);
        func(i+1);
    }

    public static void main(String[] args) {
        func(1);
    }
}

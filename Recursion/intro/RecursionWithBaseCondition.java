package recursion.intro;

public class RecursionWithBaseCondition {

    static int count;

    public static void func() {
        if(count==5)
            return;
        System.out.println(count);
        count++;
        func();
    }

    public static void main(String[] args) {
        count = 1;
        func();
    }
}

package recursion.intro;

public class SimpleRecursion {

    public static void func(int cnt) {
        if(cnt==11)
            return;
        System.out.println(cnt);
        func(cnt+1);
    }

    public static void main(String[] args) {
        func(1);
    }
}

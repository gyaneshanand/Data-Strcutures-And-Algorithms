package recursion.basicRecursion;

public class PrintNto1UsingBacktracking {

    static void f(int i, int N) {
        if (i > N)
            return;
        f(i+1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int N = 5;
        f(1,N);
    }
}

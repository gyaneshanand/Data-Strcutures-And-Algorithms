package recursion.basicRecursion;

// METHOD 1

/*
public class PrintLineralyFrom1ToN {

    static int N;

    public static void printLineralyFrom1ToN(int c) {
        if(c>N)
            return;
        System.out.println(c);
        printLineralyFrom1ToN(c+1);
    }


    public static void main(String[] args) {
        N = 10;
        printLineralyFrom1ToN(1);
    }
}
*/

public class PrintLineralyFrom1ToN {

    public static void printLineralyFrom1ToN(int c, int N) {
        if(c>N)
            return;
        System.out.println(c);
        printLineralyFrom1ToN(c+1, N);
    }


    public static void main(String[] args) {
        int N = 10;
        printLineralyFrom1ToN(1, N);
    }
}

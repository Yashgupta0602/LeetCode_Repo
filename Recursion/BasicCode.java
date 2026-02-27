package Recursion;

public class Basic {
    public static void main(String[] args) {
        function(5);
        System.out.println();
        function2(5);
    }


    // Prints 1->N
    public static void function(int n) {
        if (n <= 0) {
            return;
        }
        function(n - 1);
        System.out.print(n);

    }


    // Prints N->1
    static void function2(int m) {
        if (m <= 0){
            return;
        }
        System.out.print(m);
        function2(m-1);
    }
}


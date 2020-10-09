package marion;

import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
}
package vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array's size: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            int j = i + 1;
            System.out.println("Height number #" + j);
            double h = sc.nextDouble();
            vect[i] = h;
        }
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i];
        }
        double result = sum / vect.length;
        System.out.printf("Average height: %.2f", result);

    }

}

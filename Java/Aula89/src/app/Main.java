package app;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++){
            sc.nextLine(); //quebra de linha ficou pendente... este comando vai consumir ela para que nao ocorra nenhum bug na entrada de dados
            System.out.println("Product: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("Average price = %.2f%n", avg);
    }
}

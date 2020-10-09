package app;

import entities.Students;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rooms = new int[10];
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        if((n < 1) || (n > 10)){
            System.out.println("Only numbers between 1 and 10 are available!");
        }
        Students[] students = new Students[n];
        


    }
}

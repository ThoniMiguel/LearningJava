package app;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();


            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }

        System.out.print("Enter the employee Id that will have salary increase: ");
        int isSalary = sc.nextInt();
        
    }
}

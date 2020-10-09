package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("marco");
        list.add("Thoni");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Jair");

        System.out.println("-------------------");

        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }
        //list.remove(1);
        //predicado:
        System.out.println("-------------------");

        list.removeIf(x -> x.charAt(0) == 'm' || x.charAt(0) == 'M');
        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of 'Bob': " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' || x.charAt(0) == 'a').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);



    }

}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Songsterr");
        list.add("Bob");
        list.add("Thoni");
        list.add("Jair");
        list.add("Foxy");
        list.add(2,"marco");

        System.out.println("Size: "+list.size());


        for(String x : list){
            System.out.println(x);
        }
        System.out.println("---------------------");

        //list.remove("Bob");
       //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M' || x.charAt(0) == 'm'); //predicato, função lambda
        System.out.println("Size: " + list.size());
        for(String x : list){
            System.out.println(x);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        //boxing
        int x = 20;
        Object obj = x;


        //unboxing
        int y = 20;
        Object obj2 = y;
        int z = (int)obj2;

        //Wrapper class. For each primitive type in Java there is an equivalent class. i.e int -> Integer; char -> Character.
        //Wrapper classes provide a way to use primitive data type as objects;

        int n = 20;
        //Object obj = n;
        Integer wrapp = n;

        int h = wrapp; //this time, the casting wasn't necessary.
    }
}

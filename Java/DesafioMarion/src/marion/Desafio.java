package marion;


public class Desafio {
    public static void main(String[] args) {
        //array 7 numeros
        //Somar apenas os pares
        //boasorte

        int[] randNumbers = new int[7];
        for(int i = 0; i < randNumbers.length; i++){
            int rand = (int)(Math.random() * ((100 - 1) + 1)) + 1;
            randNumbers[i] = rand;
        }
//        for(int x : randNumbers){
//            System.out.println(x);
//        }

//        int[] numbers = new int[] {32, 92, 21, 39, 29, 26, 23};
        int sum = 0;
        int[] vect = new int[randNumbers.length];
        for(int i = 0; i < randNumbers.length; i++){
            if(randNumbers[i] % 2 == 0){
                sum += randNumbers[i];
                vect[i] = randNumbers[i];
            }
        }
        System.out.println("Odd numbers: ");
        for(int x : randNumbers){
            System.out.println(x);
        }
        System.out.println("Even numbers: ");
        for(int x : vect){
            System.out.println(x);
        }
        System.out.println("Sum value: "  + sum);


    }
}

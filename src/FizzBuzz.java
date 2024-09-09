import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void run(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some number : ");
        int number = myObj.nextInt();
        ArrayList<Object> output = new ArrayList<>();

        for (int i=1; i<=number; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                output.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                output.add("Fizz");
            }
            else if (i % 5 ==  0) {
                output.add("Buzz");
            } else {
                output.add(i);
            }
        }

        System.out.println(output);
    }
}

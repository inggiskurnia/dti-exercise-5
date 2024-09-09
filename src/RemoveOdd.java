import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveOdd {
    public static void run() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input length of the array");
        int numbers = myObj.nextInt();
        int[] numbersArray = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.println("Input number");
            numbersArray[i] = myObj.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(numbersArray));

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i=0; i<numbersArray.length; i++){
            if (numbersArray[i] % 2 == 0) {
                evenNumbers.add(numbersArray[i]);
            }
        }

        System.out.println("The even only array is : " + evenNumbers);

    }
}

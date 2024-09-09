import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SumPairNumbers {
    public static void run(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input length of the array");
        int numbers = myObj.nextInt();
        int[] numbersArray = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.println("Input number");
            numbersArray[i] = myObj.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(numbersArray));

        System.out.println("Input your target number : ");
        int targetNumber = myObj.nextInt();
        //HashMap<String, int[]> output = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();

        //logic
        for (int i=0; i<numbers; i++){
            for(int j=0; j<numbers; j++){
                if ((numbersArray[i] != numbersArray[j]) && (numbersArray[i] + numbersArray[j] == targetNumber)) {
                    output.add("(" + i + "," + j + ")");
                }
            }
        }

        //print output
        if (output.isEmpty()) {
            System.out.println("No Pair Exist");
        } else{
            System.out.println("The pair is/are : " + output);
        }

    }
}

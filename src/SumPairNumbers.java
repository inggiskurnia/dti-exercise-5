import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumPairNumbers {

    private ArrayList<String> target = new ArrayList<>();

    public void run(){

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

        //run the logic
        if (findTarget(numbersArray, targetNumber)){
            System.out.println("The pair is/are : " + this.target);
        } else{
            System.out.println("No Pair Exist");
        }

    };

    private boolean findTarget(int[] numbersArray, int target) {

        boolean isPresent = false;

        for (int i=0; i<numbersArray.length; i++){
            for(int j=0; j<numbersArray.length; j++){
                if ((numbersArray[i] != numbersArray[j]) && (numbersArray[i] + numbersArray[j] == target)) {
                    // output.add(new int[]{i, j});
                    this.target.add("(" + i + "," + j + ")");
                    isPresent = true;
                }
            }
        };

        return isPresent;
    }
}

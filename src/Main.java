import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Select question to be run : ");
        int question = myObj.nextInt();

        WordGuessingGame number1 = new WordGuessingGame();

        switch (question){
            case 1 : number1.run();;
        }
    }
}
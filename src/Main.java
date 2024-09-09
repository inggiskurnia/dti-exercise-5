import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Select question to be run : ");
        int question = myObj.nextInt();

        WordGuessingGame number1 = new WordGuessingGame();
        SumPairNumbers SumPairNumbers = new SumPairNumbers();

        switch (question){
            case 1 : number1.run();;
            case 2 : CurrencyConverter.run();
            case 3 : RemoveOdd.run();
            case 4 : FizzBuzz.run();
            case 5 : SumPairNumbers.run();
        }
    }
}
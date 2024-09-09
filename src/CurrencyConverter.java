import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    public static void run () {
        String[] currencyArray = {"USD", "EUR", "GBP", "JPY"};

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the amount to convert : ");
        int amount = myObj.nextInt();
        System.out.println("Enter the source of the currency " + Arrays.toString(currencyArray));
        myObj.nextLine();
        String sourceCurrency = myObj.nextLine();
        System.out.println("Enter the target currency " + Arrays.toString(currencyArray));
        String targetCurrency = myObj.nextLine();

        double convertedCurrency = getConvertedCurrency(sourceCurrency, targetCurrency, amount);
        System.out.println("The converted currency is : " + convertedCurrency);

    }

    private static double getConvertedCurrency(String sourceCurrency, String targetCurrency, int amount) {
        String converter = sourceCurrency.toUpperCase() + "_TO_" + targetCurrency.toUpperCase();

        double convertedCurrency = 0;
        double USD_TO_EUR = 0.92;
        double EUR_TO_USD = 0.64;
        double USD_TO_GBP = 0.79;
        double USD_TO_JPY = 147.65;

        switch(converter){
            case "USD_TO_EUR" : convertedCurrency = amount * USD_TO_EUR;
            case "EUR_TO_USD" : convertedCurrency = amount * EUR_TO_USD;
            case "USD_TO_GBP" : convertedCurrency = amount * USD_TO_GBP;
            case "USD_TO_JPY" : convertedCurrency = amount * USD_TO_JPY;
        }
        return convertedCurrency;
    }
}

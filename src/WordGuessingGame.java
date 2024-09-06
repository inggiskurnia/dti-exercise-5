import java.util.Scanner;

public class WordGuessingGame {
    private String[] words = {"jakarta", "bandung", "surabaya", "pekanbaru", "batam"};
    private int attemptLeft = 10;
    public StringBuilder hidenWord = new StringBuilder();

    //Select hidden word
    private String selectRandomWord(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Select predefined word, enter number from 0 to 4 : ");
        int selectNumber = myObj.nextInt();

        switch(selectNumber) {
            case 0 : return words[0];
            case 1 : return words[1];
            case 2 : return words[2];
            case 3 : return words[3];
            case 4 : return words[4];
            default: return words[0];
        }
    }

    //Return hidden word for visual
    private void hideWord(String word){

        for (int i=0; i<word.length(); i++) {
            this.hidenWord.append('_');
        }
        System.out.println("The hidden word is : " + hidenWord);
    }

    //To display guess from user
    private char getPlayerGuess() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Guess some character in the word : ");
        char guessChar = myObj.nextLine().charAt(0);
        return guessChar;
    }

    //To check weather the guess is in the word
    private boolean isGuessCorrect(String word, char guess) {
        boolean correct = false;

        for(int i=0; i<word.length(); i++) {
            if (guess == word.charAt(i)){
                correct = true;
                break;
            }
            else correct =  false;
        }
        return correct;
    }

    //Update hidden word
    private void updateHiddenWord(String word, char guess){

        if (String.valueOf(hidenWord) == word){
            this.attemptLeft = 0;
            System.out.println("You have guess the correct word : " + hidenWord);
            return;
        }

        if (isGuessCorrect(word,guess)){
            for(int i=0; i<word.length(); i++){
                if (guess == word.charAt(i)) {
                    this.hidenWord.setCharAt(i, guess);
                }
            }
            System.out.println("Updated hidden word is " + hidenWord);
        } else {
            System.out.println("Your guess is incorrect " + hidenWord);
        }

    }

    public void run() {
        //play game
        String selectedWord = selectRandomWord();
        hideWord(selectedWord);

        for(int i=0; i<attemptLeft; i++){
            updateHiddenWord(selectedWord, getPlayerGuess());
        }
    }

}

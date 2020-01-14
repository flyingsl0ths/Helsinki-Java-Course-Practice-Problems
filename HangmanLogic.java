public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        
        // if the letter has already been guessed, nothing happens
        if(!this.guessedLetters.contains(letter))
        {
            // it the word does not contains the guessed letter, the number of faults increases
            if(!word.contains(letter))
            {
                this.numberOfFaults++;   
            }
        }

        // the letter is added among the already guessed letters
        if(letter.contains(" "))
        {
            String removedWhitespace = letter.trim();
            this.guessedLetters += removedWhitespace;   
        } else {
            this.guessedLetters += letter;
        }
        
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        String currentLetter = "";
        
        // create the hidden word by iterating through this.word letter by letter
        for(int i = 0, l = this.word.length(); i < l; i++)
        {
            currentLetter = "" + this.word.charAt(i);
            
            // if the letter in turn is within the guessed words, put it in the hidden word
            if(this.guessedLetters.contains(currentLetter))
            {
                hiddenWord += currentLetter;
            } else {
                // if the letter is not among the guessed ones, replace it with _ in the hidden word
                hiddenWord += "_";
            }
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
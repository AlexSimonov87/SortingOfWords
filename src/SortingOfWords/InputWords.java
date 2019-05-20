


package SortingOfWords;

public class InputWords {

    private String word;
    private int lengthWord;
    private int quantityOfVowels;


    public InputWords() {
    }





    public InputWords(String word, int lengthWord, int quantityOfVowels) {
        this.word = word;
        this.lengthWord = lengthWord;
        this.quantityOfVowels = quantityOfVowels;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLengthWord() {
        return lengthWord;
    }

    public void setLengthWord(int lengthWord) {
        this.lengthWord = lengthWord;
    }

    public int getQuantityOfVowels() {
        return quantityOfVowels;
    }

    public void setQuantityOfVowels(int quantityOfVowels) {
        this.quantityOfVowels = quantityOfVowels;
    }



}

package SortingOfWords;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Logic logic = new Logic();

        logic.initialization();
        logic.sortingAccordingToIdenticalQuantityOfLettersAndVowels();
        logic.sortingBackAccordingToWordLength();
        logic.sortingBackAccordingToQuantityOfVowels();
    }
}
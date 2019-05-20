
package SortingOfWords;

import java.io.IOException;
import java.util.*;

class Logic {

    List<InputWords> listWithThreeParam = new ArrayList<>();

    public void initialization() throws IOException {

        Scanner scanKeyboard = new Scanner(System.in);
        int sizeArray;
        System.out.println("1) Введите цифру. Т.е. нужно количество слов для сортировки и нажмите Enter");
        System.out.println("2) На второй строке введите нужно количество слов через пробел.");
        sizeArray = scanKeyboard.nextInt();

        String[] arrayString = new String[sizeArray];
        Scanner inputwords = new Scanner(System.in);
        String wordsOfString = inputwords.nextLine();
        arrayString = wordsOfString.split(" ");

        // выброс ошибки, если введено больше слов, чем указывалось в начале .
        int counter = 0;
        if (wordsOfString.length() != 0) {
            counter++;
            for (int i = 0; i < wordsOfString.length(); i++) {
                if (wordsOfString.charAt(i) == ' ') {
                    counter++;
                } } }
        if (counter > sizeArray)
            throw new IOException("Вы ввели слишком много слов");


        // выброс ошибки, если в словах встречаются буквы из английской раскладки клавиатуры
        boolean conditionOfKeyboardLayout = false;
        FunctionsCountingOfLettersCheckOfKeyboardLayout func = new FunctionsCountingOfLettersCheckOfKeyboardLayout();
        try {for (int i = 0; i < sizeArray; i++)
              {conditionOfKeyboardLayout = func.checkOfKeyboardLayoutPattern(arrayString[i]);
                if (conditionOfKeyboardLayout == true) {
                   throw new IOException("  \n" +
                                         "Ошибка! Переключите раскладку клавиатуры на русскую \n" +
                                         "Программа может некорректно отобрать сортировку"); } }
        } catch (Exception ex) {
          System.out.println(ex.getMessage()); }


          
          
        List<String> ArrayListWithWords = new ArrayList<>();
        Collections.addAll(ArrayListWithWords, arrayString);
          // создаем объекты класса InputWords с тремя параметрами и заносим их в listWithThreeParam
          for (int i = 0; i < ArrayListWithWords.size(); i++) {
          InputWords inputWordsObject = new InputWords();
          FunctionsCountingOfLettersCheckOfKeyboardLayout functiontCountObject = new      FunctionsCountingOfLettersCheckOfKeyboardLayout();

          int amountOfLetters = functiontCountObject.countingTheNumberOfLetters(ArrayListWithWords.get(i));
          int amountOfVowels = functiontCountObject.countingTheNumberOfVowels(ArrayListWithWords.get(i));
          inputWordsObject.setWord(ArrayListWithWords.get(i));
          inputWordsObject.setLengthWord(amountOfLetters);
          inputWordsObject.setQuantityOfVowels(amountOfVowels);
          listWithThreeParam.add(i, inputWordsObject);
          }
          System.out.println(); }


    // сортировка в обратном порядке, если есть слова с одинаковым количество гласных и букв
    void sortingAccordingToIdenticalQuantityOfLettersAndVowels() {
    outer:
    for (int i = 0; i < listWithThreeParam.size(); i++) {
        for (int j = i + 1; j < listWithThreeParam.size(); j++) {
            if (listWithThreeParam.get(i).getLengthWord() == listWithThreeParam.get(j).getLengthWord() && listWithThreeParam.get(i).getQuantityOfVowels() == listWithThreeParam.get(j).getQuantityOfVowels())
            {Collections.reverse(listWithThreeParam);
                break outer; } } } }

    // сортировка по количеству букв в слове. От большего к меньшему.
    void sortingBackAccordingToWordLength() {
       Collections.sort(listWithThreeParam, new BackwardsStringLengthComparator());}

    // сортировка по количеству гласных в слове. От большего к меньшему.
    void sortingBackAccordingToQuantityOfVowels() {
        Collections.sort(listWithThreeParam, new BackwardsCountTheNumberOfVowels());
        System.out.println();
        for (InputWords g : listWithThreeParam) {
            System.out.println(g.getWord());
        } }

}

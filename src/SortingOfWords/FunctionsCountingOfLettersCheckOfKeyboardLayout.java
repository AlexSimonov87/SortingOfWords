




package SortingOfWords;

class FunctionsCountingOfLettersCheckOfKeyboardLayout {

    // вычисление длины слова //
    public int countingTheNumberOfLetters (String word){
        return word.length();
    }
    // вычисление количества гласных в слове //
    public int countingTheNumberOfVowels (String string){

        char[] arrayOfVowels = new char[]{'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я', 'А', 'О', 'И', 'Е', 'Ё', 'Э', 'Ы', 'У', 'Ю', 'Я'};
        int counter = 0;
        char[] arrayofWord = string.toCharArray();

        for (char char1 : arrayofWord) {
            for (char char2 : arrayOfVowels) {
                if (char1 == char2){
                    counter++;
                }
            }
        }
        return  counter;
    }


    // проверка на английскую раскладку
    public boolean checkOfKeyboardLayoutPattern(String string) {
        boolean value = false;
        String englishAlphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

        for (int j = 0; j < string.length(); j++) {
            for (int k = 0; k < englishAlphabet.length(); k++) {
                if ((int)englishAlphabet.charAt(k) == (int)string.charAt(j)) {
                    value = true;
                    return value;
                } else {value=false;}
            }
        }
        return value;
    }

}

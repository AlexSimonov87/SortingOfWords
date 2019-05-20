package SortingOfWords;

import java.util.Comparator;

// компаратор для сортировки по количеству гласных. От большего к меньшему.
class BackwardsCountTheNumberOfVowels implements Comparator<InputWords> {

    @Override
    public int compare(InputWords o1, InputWords o2) {
        if (o1.getQuantityOfVowels() > o2.getQuantityOfVowels()) {
            return -1;
        } else if (o1.getQuantityOfVowels() < o2.getQuantityOfVowels()) {
            return 1;
        } else {
            return 0;
        }
    }
}
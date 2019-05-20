package SortingOfWords;

import java.util.Comparator;

// компаратор для сортировки по длине слова. От большего к меньшему.
class BackwardsStringLengthComparator implements Comparator<InputWords> {

    @Override
    public int compare(InputWords o1, InputWords o2) {
        if (o1.getLengthWord() > o2.getLengthWord()) {
            return -1;
        } else if (o1.getLengthWord() < o2.getLengthWord()) {
            return 1;
        } else {
            return 0;
        }
    }
}





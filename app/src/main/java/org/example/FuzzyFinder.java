package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            String middleColor = fuzzies.get(middle).color;

            if (middleColor.equals("gold")) {
                return middle;
            } else if (middleColor.compareTo("gold") < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}

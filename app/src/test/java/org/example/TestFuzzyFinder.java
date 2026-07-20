package org.example;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFuzzyFinder {

    @Test
    public void testLinearSearchSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
        int index = finder.linearSearch(fuzzies);

        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testBinarySearchSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
        int index = finder.binarySearch(fuzzies);

        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testLinearSearchRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.linearSearch(fuzzies);

        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testBinarySearchRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.binarySearch(fuzzies);

        assertTrue(index == -1 || fuzzies.get(index).color.equals("gold"));
    }
}

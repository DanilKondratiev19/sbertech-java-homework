package ru.study.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortUtilsTest {

    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};

        assertArrayEquals(expected, SortUtils.bubbleSort(array));
    }

    @Test
    public void testQuickSort() {
        int[] array = {9, 4, 6, 2, 7};
        int[] expected = {2, 4, 6, 7, 9};

        assertArrayEquals(expected, SortUtils.quickSort(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] expected = {};

        assertArrayEquals(expected, SortUtils.bubbleSort(array));
        assertArrayEquals(expected, SortUtils.quickSort(array));
    }
}
package ru.study.day3;

public class SortUtils {

    public static int[] bubbleSort(int[] array) {
        int[] result = array.clone();

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }

    public static int[] quickSort(int[] array) {
        int[] result = array.clone();
        quickSort(result, 0, result.length - 1);
        return result;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(array, left, j);
        quickSort(array, i, right);
    }
}
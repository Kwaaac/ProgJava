package exo4;

import java.util.Arrays;

public class MainExo4 {
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public int indexOfMin(int[] array) {
        return indexOfMin(array, 0, array.length);
    }

    public static int indexOfMin(int[] array, int startIndex, int endIndex) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        if(startIndex > endIndex || startIndex < 0 || endIndex < 0){
            throw new IllegalArgumentException("The index are incorrect");
        }

        int index = startIndex;
        int min = array[index];

        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfMin(array, i, array.length));
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 11, 3, 12, 18, 3, 9, 18, 11};
        int[] array2 = {};

        sort(array2);

        System.out.println(Arrays.toString(array2));
    }
}

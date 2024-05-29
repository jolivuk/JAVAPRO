package lessons.lesson20240524;

import java.util.Arrays;
import java.util.Random;

import static lessons.lesson20240524.Constants.*;

public class ArrayWithZero {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrayWithZero(int[] array) {

        int index = 0; // Индекс для ненулевых элементов

        // Проходим по массиву и копируем все ненулевые элементы на новое место
        for (int num : array) {
            if (num != 0) {
                array[index++] = num;
            }
        }

        // Заполняем оставшиеся элементы нулями
        while (index < array.length) {
            array[index++] = 0;
        }
    }

    public static int[] createArray() {

        int[] array = new int[ARRAY_SIZE];
        int min = MIN_VALUE;
        int max = MAX_VALUE;

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt((max - min) + 1) + min;
        }
        return array;
    }
}

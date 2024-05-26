package lessons.lesson24052024;

import java.util.Arrays;
import java.util.Random;

import static lessons.lesson24052024.Constants.*;

public class ArrayWithZero {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrayWithZero(int[] array) {
//        int numOfZero = 0;
//        int i = array.length - 1;
//
//        while (i >= 0)
//        {
//            if (array[i] == 0)
//            {
//                numOfZero = 1;
//                System.out.println("Zero index " + i);
//                for (int j = i; j < array.length - numOfZero; j++) {
//                     array[j] = array[j+1];
//                     array[j+1] = 0;
//                }
//            }
//            i--;
//        }

        // Функция для перемещения нулей в конец массива

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

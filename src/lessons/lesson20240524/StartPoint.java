package lessons.lesson20240524;

import static lessons.lesson20240524.ArrayWithZero.*;

public class StartPoint {

    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);

        sortArrayWithZero(array);
        printArray(array);

    }

}
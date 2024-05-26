package lessons.lesson24052024;


import static lessons.lesson24052024.ArrayWithZero.*;

public class StartPoint {
    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);

        sortArrayWithZero(array);
        printArray(array);
    }
}
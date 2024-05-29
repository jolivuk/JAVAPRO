package lessons.lesson20240527Summary;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vehicle[] arrayVehicles = new Vehicle[5];
        Auto auto = new Auto("BMW",210, "disel");
        Bicycle bicycle = new Bicycle("BULLS",30, "mountain");
        arrayVehicles[0] = auto;
        arrayVehicles[1] = bicycle;
        System.out.println(Arrays.toString(arrayVehicles));
    }
}

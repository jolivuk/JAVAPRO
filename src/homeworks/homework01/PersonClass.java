package homeworks.homework01;

import java.util.Random;

public class PersonClass {
    public static final int PERSON_NUMBER = 10;
    public static final int MIN_AGE = 10;
    public static final int MAX_AGE = 80;
    private static String[] names = new String[PERSON_NUMBER];
    private static int[] ages = new int[PERSON_NUMBER];
    private static int index = 0;

    public static void main(String[] args) {


        int min = MIN_AGE;
        int max = MAX_AGE;

        Random rand = new Random();
        int age;
        for (int i = 0; i < PERSON_NUMBER; i++) {
            createPerson("Имя"+i,rand.nextInt((max - min) + 1) + min);
            printPersonById(i);
        }

        updatePersonById(7,"Vasya",15);

        for (int i = 0; i < PERSON_NUMBER; i++) {
            printPersonById(i);
        }

        removePersonById(5);

        removePerson(new Person("Имя3", 20));
        for (int i = 0; i < PERSON_NUMBER; i++) {
            printPersonById(i);
        }

    }

    public static void createPerson(String personName, int personAge){
        if (index<10){
            names[index] = personName;
            ages[index] = personAge;
        }
        index++;
    }

    public static String[] getPersonById(int id){
        if (id<0 || id>index){
            return new String[]{"empty","-1"};
        }
        return new String[]{names[id],Integer.toString(ages[id])};
    }

    public static void printPersonById(int id){
        if (id<0 || id>index){
            return;
        }

        //Если имя пустое, то его не выводим
        if (names[id] != null) {
            System.out.printf("Name %s - age %d\n", names[id], ages[id]);
        }
    }

    public static void printPerson(String[] person){

        System.out.printf("Name %s - age %d",person[0],person[1]);
    }


    public static void updatePersonById(int id,String newName, int newAge){
        if (id<0 || id>index){
            return;
        }
        names[id] = newName;
        ages[id] = newAge;
    }

    public static void removePersonById(int id){
        if (id<0 || id>index){
            return;
        }
        for (int i = id; i < index - 1 ; i++) {
            names[i] = names[i+1];
            ages[i] = ages[i+1];
        }

        // Уменьшаем индекс массива и обнуляем данные в последней ячейке
        index--;
        names[index] = null;
        ages[index] = 0;

    }

    public static void removePerson(Person person){
        int id = -1;
        for (int i = 0; i < index-1; i++) {
            if (person.getName().equals(names[i]) && person.getAge() == ages[i]) {
                id = i;
                break;
            }
        }
        if (id != -1) {
            for (int i = id; i < index - 1; i++) {
                names[i] = names[i + 1];
                ages[i] = ages[i + 1];
            }
        }

        // Уменьшаем индекс массива и обнуляем данные в последней ячейке
        index--;
        names[index] = null;
        ages[index] = 0;
    }

}

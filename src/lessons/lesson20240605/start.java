package lessons.lesson20240605;

public class start {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.append(2000);
        storage.append(2020);
        storage.append(2200);
        storage.append(1234);
        System.out.println(storage);
    }
}

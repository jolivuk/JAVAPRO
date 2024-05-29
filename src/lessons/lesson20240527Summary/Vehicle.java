package lessons.lesson20240527Summary;
// класс Транспортное средство
public class Vehicle {
    private String mark;
    private int speed;

    public Vehicle(String mark, int speed) {
        this.mark = mark;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mark of vehicle:" + this.getMark() + " Speed:" + this.getSpeed() + " ";
    }
}

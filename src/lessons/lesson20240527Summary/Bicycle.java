package lessons.lesson20240527Summary;

public class Bicycle extends Vehicle{
    private String type;

    public Bicycle(String mark, int speed, String type) {
        super(mark, speed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " type: " + this.getType();
    }
}

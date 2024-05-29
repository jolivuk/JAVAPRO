package lessons.lesson20240527Summary;

public class Auto extends Vehicle{

    private String motor;

    public Auto(String mark, int speed, String motor) {
        super(mark, speed);
        this.motor = motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return super.toString() + "Motor: " + this.getMotor();
    }
}

package lessons.practice20240529;

public abstract class Employee implements EmployeeInterface{
    String name;
    String position;
    Double salary;

    public Employee(String name, String position, String salary) {
        this.name = name;
        this.position = position;
        this.salary = Double.valueOf(salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.05;
    }
}

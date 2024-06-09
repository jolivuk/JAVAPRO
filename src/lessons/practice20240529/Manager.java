package lessons.practice20240529;
/*
Класс Manager (наследуется от Employee)
Дополнительное поле:
subordinatesCount (int) - количество подчиненных.
Конструктор для всех полей (включая поля базового класса).
Переопределение метода toString() для добавления информации о количестве подчиненных.
Переопределение метода calculateBonus(), где бонус увеличивается на 2% за каждого подчиненного.
Класс Developer (наследуется от Employee)
Дополнительное поле:
programmingLanguage (String) - основной язык программирования разработчика.
Конструктор для всех полей (включая поля базового класса).
Переопределение метода toString() для добавления информации об основном языке программирования.
Переопределение метода calculateBonus(), где бонус увеличивается на фиксированную сумму, например, 500 единиц.
Обработка массивов
В методе main создать массив Employee[], который будет содержать объекты Manager и Developer.
Использовать простой цикл (for или foreach), чтобы вывести информацию о каждом сотруднике и его бонусе.
 */
public abstract class Manager extends Employee{
    private int subordinatesCount;

    public Manager(String name, String position, String salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public double calculateBonus() {
        double salary =  super.getSalary();
        double salaryBonus = salary * 0.03 * this.subordinatesCount;
        return salary;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}

public class Employee implements Person {
    private String name;
    private String surname;
    private int age; // Текущий возраст работника

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        int yearsLeftToWork = 62 - age; // Вычисляем оставшиеся годы до выхода на пенсию
        System.out.println("Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Years left to work: " + yearsLeftToWork);
    }
}

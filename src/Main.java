public class Main {
    public static void main(String[] args) {
        // Создание объекта Student
        Student student = new Student(123, "Alice", "Johnson", 20);
        student.getInfo();

        // Создание объекта Employee
        Employee employee = new Employee("Bob", "Smith", 30);
        employee.getInfo();
    }
}

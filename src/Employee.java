public class Employee implements Person {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }
}

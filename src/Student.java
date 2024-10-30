public class Student implements Person {
    private int studentID;
    private String name;
    private String surname;
    private int age;

    public Student(int studentID, String name, String surname, int age) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Surname: " + surname + ", Age: " + age);
    }
}

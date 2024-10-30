public class Student implements Person {
    private int studentID;
    private String name;
    private int age;

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Age: " + age);
    }
}

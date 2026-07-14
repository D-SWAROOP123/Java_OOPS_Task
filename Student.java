public class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public void display() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Course: " + course);
    }
}

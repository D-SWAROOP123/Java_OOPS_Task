public class Main {
    public static void main(String[] args) {
        Person p = new Person("Rahul", 30);
        Student s = new Student("Ananya", 20, "Computer Science");

        p.display();
        s.display();

        p.setAge(31);
        System.out.println("Updated Age: " + p.getAge());
    }
}

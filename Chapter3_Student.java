// Chapter3_Student.java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Chapter3_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahim";
        s1.age = 20;
        s1.display();
    }
}
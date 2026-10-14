// Chapter9_Inheritance.java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

public class Chapter9_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
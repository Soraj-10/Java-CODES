// Chapter10_Polymorphism.java
interface Shape {
    double area();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}

class Rectangle implements Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l * w;
    }
}

public class Chapter10_Polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}
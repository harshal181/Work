class Shape {
    String color;
    double area;

    Shape() {
        this.color = "red";
        this.area = 0.0;
    }

    Shape(String color, double area) {
        this.color = color;
        this.area = area;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(String color, double base, double height) {
        super(color, 0.5*base*height);
        this.base = base;
        this.height = height;
    }

    void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color,Math.PI * radius * radius);
        this.radius = radius;
    }

    void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color,  double length, double width) {
        super(color, length * width);
        this.length = length;
        this.width = width;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class TestShape {
    public static void main(String[] args) {
         System.out.println("Shape Display");
        Shape s1=new Shape("Red",12.5);
         s1.display();
        System.out.println("Triangle Display:");
        Triangle t1=new Triangle("White",5,12); 
        t1.display();
        System.out.println("Circle Display:");
         Circle c1=new Circle("Black",4);
         c1.display();
        System.out.println("Rectangle Display:");
        Rectangle r1=new Rectangle("Brown",4,7);
        r1.display();
    }
}





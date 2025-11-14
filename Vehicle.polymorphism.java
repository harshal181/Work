class Vehicle {
    String brand;
    String color;
    double price;
    String brake;

    // setters
    void setBrand(String b) { this.brand = b; }
    void setColor(String c) { this.color = c; }
    void setPrice(double p) { this.price = p; }
    void setBrake(String b) { this.brake = b; }

    // getters
    String getBrand() { return this.brand; }
    String getColor() { return this.color; }
    double getPrice() { return this.price; }
    String getBrake() { return this.brake; }

    // constructors
    Vehicle() {
        this.brand = "Unknown";
        this.color = "White";
        this.price = 50000;
        this.brake = "Yes";
    }

    Vehicle(String b, String c, double p, String o) {
        this.brand = b;
        this.color = c;
        this.price = p;
        this.brake = o;
    }

    void brake() {
        System.out.println("Normal brake");
    }

    void display() {
        System.out.println("Brand = " + this.brand);
        System.out.println("Color = " + this.color);
        System.out.println("Price = " + this.price);
        System.out.println("Brake = " + this.brake);
        brake();
    }
}


// ================= Car =================
class Car extends Vehicle {
    int doors;
    String fuelType;

    Car() {
        super();
        this.doors = 4;
        this.fuelType = "Petrol";
    }

    Car(String b, String c, double p, String o, int d, String f) {
        super(b, c, p, o);
        this.doors = d;
        this.fuelType = f;
    }

    void brake() {
        System.out.println("Drum brake");
    }

    void display() {
        super.display();
        System.out.println("Doors = " + this.doors);
        System.out.println("Fuel Type = " + this.fuelType);
        brake();
    }
}


// ================= Bike =================
class Bike extends Vehicle {
    int engineCC;
    boolean hasABS;

    Bike() {
        super();
        this.engineCC = 150;
        this.hasABS = true;
    }

    Bike(String b, String c, double p, String o, int cc, boolean abs) {
        super(b, c, p, o);
        this.engineCC = cc;
        this.hasABS = abs;
    }
void brake(){
System.out.println("Disk Brake");
}

    void display() {
        super.display();
        System.out.println("Engine CC = " + this.engineCC);
        System.out.println("ABS Available = " + this.hasABS);
        brake();
    }
}


// ================= Cycle =================
class Cycle extends Vehicle {
    String type;
    int gears;

    Cycle() {
        super();
        this.type = "Gearless";
        this.gears = 0;
    }

    Cycle(String b, String c, double p, String o, String t, int g) {
        super(b, c, p, o);
        this.type = t;
        this.gears = g;
    }

    void brake() {
        System.out.println("Manual brake");
    }

    void display() {
        super.display();
        System.out.println("Type = " + this.type);
        System.out.println("No. of Gears = " + this.gears);
        brake();
    }
}


// ================= Main Class =================
class TestVehicle {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Details ===");
        Vehicle v1 = new Vehicle("Toyota", "Blue", 40000, "Yes");
        v1.display();

        System.out.println("\n=== Car Details ===");
        Car c1 = new Car("Hyundai", "Red", 850000, "Yes", 4, "Petrol");
        c1.display();

        System.out.println("\n=== Bike Details ===");
        Bike b1 = new Bike("Yamaha", "Blue", 120000, "Yes", 155, true);
        b1.display();

        System.out.println("\n=== Cycle Details ===");
        Cycle cy1 = new Cycle("Hero", "Black", 18000, "Yes", "Gear", 6);
        cy1.display();
    }
}

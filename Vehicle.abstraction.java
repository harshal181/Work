abstract class Vehicle {
    String brand;
    String model;
    double price;

    Vehicle() {
        this.brand = "Unknown";
        this.model = "N/A";
        this.price = 0;
    }

    Vehicle(String b, String m, double p) {
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    abstract String vehicleType();

    public String toString() {
        return "Brand=" + this.brand +
               " Model=" + this.model +
               " Price=" + this.price +
               " Type=" + this.vehicleType();
    }

    void display() {
        System.out.println(this.toString());  
  }
}

class Car extends Vehicle {
    int seats;
    String fuelType;

    Car() {
        super();
        this.seats = 4;
        this.fuelType = "Petrol";
    }

    Car(String b, String m, double p, int s, String f) {
        super(b, m, p);
        this.seats = s;
        this.fuelType = f;
    }

    String vehicleType() {
        return "Car";
    }

    public String toString() {
        return super.toString() +
               " Seats=" + this.seats +
               " FuelType=" + this.fuelType;
    }
}

class TestVehicle {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car("Toyota", "Fortuner", 4500000, 7, "Diesel");
        v.display();
        System.out.println();

        v = new Bike("Yamaha", "R15", 180000, 155, "Racing");
        v.display();
    }
}


class Bike extends Vehicle {
    int engineCC;
    String type;

    Bike() {
        super();
        this.engineCC = 150;
        this.type = "Sport";
    }

    Bike(String b, String m, double p, int cc, String t) {
        super(b, m, p);
        this.engineCC = cc;
        this.type = t;
    }

    String vehicleType() {
        return "Bike";
    }

    public String toString() {
        return super.toString() +
               " EngineCC=" + this.engineCC +
               " Type=" + this.type;
    }
}



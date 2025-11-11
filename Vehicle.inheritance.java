class Vehicle {
    String brand;
    String color;
    double price;

 
 void setBrand(String b) { 
       this.brand = b;
             }
    void setColor(String c) { 
     this.color = c;
 }
    void setPrice(double p) { 
   this.price = p; 
}

   
    String getBrand() {
 return this.brand;
 }
    String getColor() {
   return this.color; 
}
    double getPrice() {
    return this.price;
 }

 
    Vehicle() {
        this.brand = "Unknown";
        this.color = "White";
        this.price = 50000;
    }

    Vehicle(String b, String c, double p) {
        this.brand = b;
        this.color = c;
        this.price = p;
    }

    
    void display() {
        System.out.println("Brand = " + this.brand);
        System.out.println("Color = " + this.color);
        System.out.println("Price = " + this.price);
    }
}


class Car extends Vehicle {
    int doors;
    String fuelType;

   
    void setDoors(int d) { this.doors = d; }
    void setFuelType(String f) { this.fuelType = f; }

   
    int getDoors() { return this.doors; }
    String getFuelType() { return this.fuelType; }


    Car() {
        super();
        this.doors = 4;
        this.fuelType = "Petrol";
    }

    Car(String b, String c, double p, int d, String f) {
        super(b, c, p);
        this.doors = d;
        this.fuelType = f;
    }

    void display() {
        super.display();
        System.out.println("Doors = " + this.doors);
        System.out.println("Fuel Type = " + this.fuelType);
    }
}


class Bike extends Vehicle {
    int engineCC;
    boolean hasABS;

  
    void setEngineCC(int cc) { this.engineCC = cc; }
    void setHasABS(boolean abs) { this.hasABS = abs; }

   
    int getEngineCC() { return this.engineCC; }
    boolean getHasABS() { return this.hasABS; }


    Bike() {
        super();
        this.engineCC = 150;
        this.hasABS = true;
    }

    Bike(String b, String c, double p, int cc, boolean abs) {
        super(b, c, p);
        this.engineCC = cc;
        this.hasABS = abs;
    }

    void display() {
        super.display();
        System.out.println("Engine CC = " + this.engineCC);
        System.out.println("ABS Available = " + this.hasABS);
    }
}


class Cycle extends Vehicle {
    String type; 
    int gears;

   
    void setType(String t) { this.type = t; }
    void setGears(int g) { this.gears = g; }


    String getType() { return this.type; }
    int getGears() { return this.gears; }

    Cycle() {
        super();
        this.type = "Gearless";
        this.gears = 0;
    }

    Cycle(String b, String c, double p, String t, int g) {
        super(b, c, p);
        this.type = t;
        this.gears = g;
    }

    void display() {
        super.display();
        System.out.println("Type = " + this.type);
        System.out.println("No. of Gears = " + this.gears);
    }
}

class TestVehicle {
    public static void main(String[] args) {
       System.out.println("==== Vehicle ==="); 
       Vehicle v1=new Vehicle("toyato","blue",40000);
       v1.display();
    
        System.out.println("=== Car Details ===");
        Car c1 = new Car("Hyundai", "Red", 850000, 4, "Petrol");
        c1.display();

        System.out.println("\n=== Bike Details ===");
        Bike b1 = new Bike("Yamaha", "Blue", 120000, 155, true);
        b1.display();

        System.out.println("\n=== Cycle Details ===");
        Cycle cy1 = new Cycle("Hero", "Black", 18000, "Gear", 6);
        cy1.display();
    }
}
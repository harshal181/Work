class Device {
    String brand;
    double price;
    String color;

    void setBrand(String b) { this.brand = b; }
    void setPrice(double p) { this.price = p; }
    void setColor(String c) { this.color = c; }

    String getBrand() { return this.brand; }
    double getPrice() { return this.price; }
    String getColor() { return this.color; }

    Device() {
        this.brand = "unknown";
        this.price = 0.0;
        this.color = "unknown";
    }

    Device(String b, double p, String c) {
        this.brand = b;
        this.price = p;
        this.color = c;
    }

    void display() {
        System.out.println("Device Display:");
        System.out.println("Brand=" + this.brand);
        System.out.println("Price=" + this.price);
        System.out.println("Color=" + this.color);
    }

    void use() {
        System.out.println("Device is used for daily tasks.");
    }
}

class Laptop extends Device {
    int ram;
    int storage;

    void setRam(int r) { this.ram = r; }
    void setStorage(int s) { this.storage = s; }

    int getRam() { return this.ram; }
    int getStorage() { return this.storage; }

    Laptop() {
        super();
        this.ram = 8;
        this.storage = 512;
    }

    Laptop(String b, double p, String c, int r, int s) {
        super(b, p, c);
        this.ram = r;
        this.storage = s;
    }

    void display() {
        System.out.println("Laptop Display:");
        super.display();
        System.out.println("RAM=" + this.ram);
        System.out.println("Storage=" + this.storage);
    }

    void use() {
        System.out.println("Laptop is used for work and programming.");
    }
}

class Mobile extends Device {
    int camera;
    boolean is5G;

    void setCamera(int cam) { this.camera = cam; }
    void setIs5G(boolean g) { this.is5G = g; }

    int getCamera() { return this.camera; }
    boolean getIs5G() { return this.is5G; }

    Mobile() {
        super();
        this.camera = 12;
        this.is5G = true;
    }

    Mobile(String b, double p, String c, int cam, boolean g) {
        super(b, p, c);
        this.camera = cam;
        this.is5G = g;
    }

    void display() {
        System.out.println("Mobile Display:");
        super.display();
        System.out.println("Camera=" + this.camera);
        System.out.println("Is 5G=" + this.is5G);
    }

    void use() {
        System.out.println("Mobile is used for calling and social media.");
    }
}

class TestDevice {
    public static void main(String[] args) {

        Device d;

        d = new Laptop("HP", 55000.0, "Silver", 16, 1024);
        d.display();
        d.use();
        System.out.println();

        d = new Mobile("Samsung", 25000.0, "Black", 64, true);
        d.display();
        d.use();
    }
}

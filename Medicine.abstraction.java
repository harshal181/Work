abstract class Medicine {
    String name;
    String manufacturer;
    double price;
    String expiryDate;

abstract String use();

void setName(String n) {
        this.name = n;
   }
void setManufacturer(String m) {
        this.manufacturer = m;
    }

void setPrice(double p) {
        this.price = p;
    }

void setExpiryDate(String e) {
        this.expiryDate = e;
    }

String getName() {
        return this.name;
    }

 String getManufacturer() {
        return this.manufacturer;
    }

  double getPrice() {
        return this.price;
    }

 String getExpiryDate() {
        return this.expiryDate;
    }

 Medicine() {
        this.name = "unknown";
        this.manufacturer = "unknown";
        this.price = 0.0;
        this.expiryDate = "unknown";
    }

    Medicine(String n, String m, double p, String e) {
        this.name = n;
        this.manufacturer = m;
        this.price = p;
        this.expiryDate = e;
    }


public String toString(){
return "Name="+this.name+"\nManufacturer="+this.manufacturer+"\nPrice="+this.price+"\nExpiry Date="+this.expiryDate;
}

  void display(){
System.out.println(this.toString());
}


}

class Tablet extends Medicine {
    int dosage;
    boolean isPrescription;

    void setDosage(int d) {
        this.dosage = d;
    }

    void setIsPrescription(boolean p) {
        this.isPrescription = p;
    }

    int getDosage() {
        return this.dosage;
    }

    boolean getIsPrescription() {
        return this.isPrescription;
    }

    Tablet() {
        super();
        this.dosage = 500;
        this.isPrescription = true;
    }

    Tablet(String n, String m, double p, String e, int d, boolean pr) {
        super(n, m, p, e);
        this.dosage = d;
        this.isPrescription = pr;
    }

    void display() {
        System.out.println("Tablet Display:");
        super.display();
        System.out.println("Dosage=" + this.dosage);
        System.out.println("Prescription Required=" + this.isPrescription);
    }
String use(){
 return "Tablets are used for regular dosage and oral consumption.";
}
}

class Syrup extends Medicine {
    double volume;
    String flavor;

    void setVolume(double v) {
        this.volume = v;
    }

    void setFlavor(String f) {
        this.flavor = f;
    }

    double getVolume() {
        return this.volume;
    }

    String getFlavor() {
        return this.flavor;
    }

    Syrup() {
        super();
        this.volume = 100.0;
        this.flavor = "Unknown";
    }

    Syrup(String n, String m, double p, String e, double v, String f) {
        super(n, m, p, e);
        this.volume = v;
        this.flavor = f;
    }

    void display() {
        System.out.println("Syrup Display:");
        super.display();
        System.out.println("Volume=" + this.volume);
        System.out.println("Flavor=" + this.flavor);
    }
String use(){
 return "Syrup is used for children and liquid dosage.";
}
}

class Injection extends Medicine {
    double volume;
    boolean isIntravenous;

    void setVolume(double v) {
        this.volume = v;
    }

    void setIsIntravenous(boolean i) {
        this.isIntravenous = i;
    }

    double getVolume() {
        return this.volume;
    }

    boolean getIsIntravenous() {
        return this.isIntravenous;
    }

    Injection() {
        super();
        this.volume = 5.0;
        this.isIntravenous = true;
    }

    Injection(String n, String m, double p, String e, double v, boolean i) {
        super(n, m, p, e);
        this.volume = v;
        this.isIntravenous = i;
    }

    void display() {
        System.out.println("Injection Display:");
        super.display();
        System.out.println("Volume=" + this.volume);
        System.out.println("Intravenous=" + this.isIntravenous);
    }
String use(){
return "Injection is used for fast relief and emergency treatment.";
}

}

class TestMedicine {
    public static void main(String[] args) {
        
Medicine t1;
t1 = new Tablet("Paracetamol", "ABC Pharma", 50.0, "12/2026", 500, true);
t1.display();
System.out.println(t1.use());

t1 = new Syrup("Cough Syrup", "XYZ Pharma", 120.0, "06/2025", 150.0, "Cherry");
t1.display();
System.out.println(t1.use());

t1 = new Injection("Insulin", "HealthCare Ltd", 250.0, "03/2027", 10.0, true); 
t1.display();
System.out.println(t1.use());
   }
}

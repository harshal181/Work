class Doctor {
    String name;
    int age;
    String specialization;
    double salary;

    void setName(String n) {
        this.name = n;
    }

    void setAge(int a) {
        this.age = a;
    }

    void setSpecialization(String s) {
        this.specialization = s;
    }

    void setSalary(double sal) {
        this.salary = sal;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getSpecialization() {
        return this.specialization;
    }

    double getSalary() {
        return this.salary;
    }

    Doctor() {
        this.name = "unknown";
        this.age = 0;
        this.specialization = "General";
        this.salary = 0.0;
    }

    Doctor(String n, int a, String s, double sal) {
        this.name = n;
        this.age = a;
        this.specialization = s;
        this.salary = sal;
    }

    void display() {
        System.out.println("Doctor Display:");
        System.out.println("Name=" + this.name);
        System.out.println("Age=" + this.age);
        System.out.println("Specialization=" + this.specialization);
        System.out.println("Salary=" + this.salary);
    }
}

class Surgeon extends Doctor {
    int numberOfOperations;
    boolean isCertified;

    void setNumberOfOperations(int n) {
        this.numberOfOperations = n;
    }

    void setIsCertified(boolean c) {
        this.isCertified = c;
    }

    int getNumberOfOperations() {
        return this.numberOfOperations;
    }

    boolean getIsCertified() {
        return this.isCertified;
    }

    Surgeon() {
        super();
        this.numberOfOperations = 50;
        this.isCertified = true;
    }

    Surgeon(String n, int a, String s, double sal, int no, boolean c) {
        super(n, a, s, sal);
        this.numberOfOperations = no;
        this.isCertified = c;
    }

    void display() {
        System.out.println("Surgeon Display:");
        super.display();
        System.out.println("Number of Operations=" + this.numberOfOperations);
        System.out.println("Certified=" + this.isCertified);
    }
}

class TherapyDoctor extends Doctor {
    int numberOfPatients;
    String therapyType;

    void setNumberOfPatients(int n) {
        this.numberOfPatients = n;
    }

    void setTherapyType(String t) {
        this.therapyType = t;
    }

    int getNumberOfPatients() {
        return this.numberOfPatients;
    }

    String getTherapyType() {
        return this.therapyType;
    }

    TherapyDoctor() {
        super();
        this.numberOfPatients = 20;
        this.therapyType = "Physical";
    }

    TherapyDoctor(String n, int a, String s, double sal, int np, String tt) {
        super(n, a, s, sal);
        this.numberOfPatients = np;
        this.therapyType = tt;
    }

    void display() {
        System.out.println("Therapy Doctor Display:");
        super.display();
        System.out.println("Number of Patients=" + this.numberOfPatients);
        System.out.println("Therapy Type=" + this.therapyType);
    }
}

class TestDoctor {
    public static void main(String[] args) {
       
        Surgeon s1 = new Surgeon("Dr. Smith", 45, "Surgery", 150000.0, 120, true);                         TherapyDoctor t1 = new TherapyDoctor("Dr. Emma", 38, "Therapy", 90000.0, 60, "Occupational");

        s1.display();
        System.out.println();
        t1.display();
        
    }
}
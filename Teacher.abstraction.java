abstract class Teacher {
    String name;
    int age;
    String subject;
    double salary;

    void setName(String n) { this.name = n; }
    void setAge(int a) { this.age = a; }
    void setSubject(String s) { this.subject = s; }
    void setSalary(double sal) { this.salary = sal; }

    String getName() { return this.name; }
    int getAge() { return this.age; }
    String getSubject() { return this.subject; }
    double getSalary() { return this.salary; }

    Teacher() {
        this.name = "unknown";
        this.age = 0;
        this.subject = "unknown";
        this.salary = 0.0;
    }

    Teacher(String n, int a, String s, double sal) {
        this.name = n;
        this.age = a;
        this.subject = s;
        this.salary = sal;
    }

    abstract String teach();

    public String toString() {
        return "Name=" + this.name +
               "\nAge=" + this.age +
               "\nSubject=" + this.subject +
               "\nSalary=" + this.salary +
               "\nTeaching Style=" + teach();
    }

    void display() {
        System.out.println(this.toString());
    }
}

class MathTeacher extends Teacher {
    int numberOfStudents;
    boolean usesTechnology;

    void setNumberOfStudents(int n) { this.numberOfStudents = n; }
    void setUsesTechnology(boolean t) { this.usesTechnology = t; }

    int getNumberOfStudents() { return this.numberOfStudents; }
    boolean getUsesTechnology() { return this.usesTechnology; }

    MathTeacher() {
        super();
        this.numberOfStudents = 30;
        this.usesTechnology = true;
    }

    MathTeacher(String n, int a, String s, double sal, int ns, boolean ut) {
        super(n, a, s, sal);
        this.numberOfStudents = ns;
        this.usesTechnology = ut;
    }

    String teach() {
        return "Teaches Mathematics with logical methods.";
    }

    public String toString() {
        return super.toString() +
               "\nNumber of Students=" + this.numberOfStudents +
               "\nUses Technology=" + this.usesTechnology;
    }

    void display() {
        System.out.println(this.toString());
    }
}

class PhysicsTeacher extends Teacher {
    boolean hasLab;
    int numberOfExperiments;

    void setHasLab(boolean l) { this.hasLab = l; }
    void setNumberOfExperiments(int e) { this.numberOfExperiments = e; }

    boolean getHasLab() { return this.hasLab; }
    int getNumberOfExperiments() { return this.numberOfExperiments; }

    PhysicsTeacher() {
        super();
        this.hasLab = true;
        this.numberOfExperiments = 10;
    }

    PhysicsTeacher(String n, int a, String s, double sal, boolean hl, int ne) {
        super(n, a, s, sal);
        this.hasLab = hl;
        this.numberOfExperiments = ne;
    }

    String teach() {
        return "Teaches Physics with experiments.";
    }

    public String toString() {
        return super.toString() +
               "\nHas Lab=" + this.hasLab +
               "\nNumber of Experiments=" + this.numberOfExperiments;
    }

    void display() {
        System.out.println(this.toString());
    }
}

class ScienceTeacher extends Teacher {
    String specialization;
    boolean conductsFieldTrips;

    void setSpecialization(String sp) { this.specialization = sp; }
    void setConductsFieldTrips(boolean ft) { this.conductsFieldTrips = ft; }

    String getSpecialization() { return this.specialization; }
    boolean getConductsFieldTrips() { return this.conductsFieldTrips; }

    ScienceTeacher() {
        super();
        this.specialization = "General Science";
        this.conductsFieldTrips = true;
    }

    ScienceTeacher(String n, int a, String s, double sal, String sp, boolean ft) {
        super(n, a, s, sal);
        this.specialization = sp;
        this.conductsFieldTrips = ft;
    }

    String teach() {
        return "Explains scientific concepts with field activities.";
    }

    public String toString() {
        return super.toString() +
               "\nSpecialization=" + this.specialization +
               "\nConducts Field Trips=" + this.conductsFieldTrips;
    }

    void display() {
        System.out.println(this.toString());
    }
}

class TestTeacher {
    public static void main(String[] args) {

        Teacher t;

        t = new MathTeacher("Alice", 35, "Mathematics", 50000.0, 40, true);
        t.display();
        System.out.println();

        t = new PhysicsTeacher("Bob", 40, "Physics", 55000.0, true, 15);
        t.display();
        System.out.println();

        t = new ScienceTeacher("Clara", 38, "Science", 52000.0, "Biology", true);
        t.display();
    }
}

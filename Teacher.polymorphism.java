class Teacher {
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

    void display() {
        System.out.println("Teacher Display:");
        System.out.println("Name=" + this.name);
        System.out.println("Age=" + this.age);
        System.out.println("Subject=" + this.subject);
        System.out.println("Salary=" + this.salary);
    }

    void teach() {
        System.out.println("Teacher teaches students.");
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

    void display() {
        System.out.println("Math Teacher Display:");
        super.display();
        System.out.println("Number of Students=" + this.numberOfStudents);
        System.out.println("Uses Technology=" + this.usesTechnology);
    }

    void teach() {
        System.out.println("Math teacher teaches mathematics.");
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

    void display() {
        System.out.println("Physics Teacher Display:");
        super.display();
        System.out.println("Has Lab=" + this.hasLab);
        System.out.println("Number of Experiments=" + this.numberOfExperiments);
    }

    void teach() {
        System.out.println("Physics teacher conducts experiments.");
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

    void display() {
        System.out.println("Science Teacher Display:");
        super.display();
        System.out.println("Specialization=" + this.specialization);
        System.out.println("Conducts Field Trips=" + this.conductsFieldTrips);
    }

    void teach() {
        System.out.println("Science teacher explains scientific concepts.");
    }
}

class TestTeacher {
    public static void main(String[] args) {

        Teacher t;

        t = new MathTeacher("Alice", 35, "Mathematics", 50000.0, 40, true);
        t.display();
        t.teach();
        System.out.println();

        t = new PhysicsTeacher("Bob", 40, "Physics", 55000.0, true, 15);
        t.display();
        t.teach();
        System.out.println();

        t = new ScienceTeacher("Clara", 38, "Science", 52000.0, "Biology", true);
        t.display();
        t.teach();
    }
}


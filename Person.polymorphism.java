class Person {
    String name;
    int age;
    String address;
    char bg;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setBg(char bg) {
        this.bg = bg;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getAddress() {
        return this.address;
    }

    char getBg() {
        return this.bg;
    }

    Person() {
        this.name = "Abhi Gupta";
        this.age = 20;
        this.address = "kalamb";
        this.bg = 'A';
    }

    Person(String n, int a, String ad, char b) {
        this.name = n;
        this.age = a;
        this.address = ad;
        this.bg = b;
    }

    void display() {
        System.out.println("name=" + this.name);
        System.out.println("age=" + this.age);
        System.out.println("address=" + this.address);
        System.out.println("bloood group=" + this.bg);
    }

    //  OVERRIDE METHOD
    void work() {
        System.out.println("General person work");
    }
}

class Student extends Person {
    int rollno;
    int standard;

    void setrollno(int r) {
        this.rollno = r;
    }

    void setstandard(int s) {
        this.standard = s;
    }

    int getrollno() {
        return this.rollno;
    }

    int getstandard() {
        return this.standard;
    }

    Student() {
        super();
        this.rollno = 2;
        this.standard = 12;
    }

    Student(String n, int a, String ad, char b, int r, int s) {
        super(n, a, ad, b);
        this.rollno = r;
        this.standard = s;
    }

    void display() {
        super.display();
        System.out.println("roll no=" + this.rollno);
        System.out.println("standard=" + this.standard);
    }

    //  OVERRIDDEN METHOD
    void work() {
        System.out.println("Student is studying.");
    }
}

class Teacher extends Person {
    int teachid;
    String degree;

    void setTeachid(int id) {
        this.teachid = id;
    }

    void setDegree(String deg) {
        this.degree = deg;
    }

    int getTeachid() {
        return this.teachid;
    }

    String getDegree() {
        return this.degree;
    }

    Teacher() {
        super();
        this.teachid = 12;
        this.degree = "Bcom";
    }

    Teacher(String n, int a, String ad, char b, int t, String d) {
        super(n, a, ad, b);
        this.teachid = t;
        this.degree = d;
    }

    void display() {
        super.display();
        System.out.println("teach id=" + this.teachid);
        System.out.println("degree=" + this.degree);
    }

    // OVERRIDDEN METHOD
    void work() {
        System.out.println("Teacher is teaching students.");
    }
}

class TestPerson {
    public static void main(String[] args) {

        // POLYMORPHISM using Person reference
        Person ref;

        ref = new Student("Amay Gupta", 20, "Wardha", 'A', 22, 12);
        ref.display();
        ref.work();  // Student version runs
        System.out.println();

        ref = new Teacher("Anirudh Sharma", 34, "Kalamb", 'B', 203, "Btech");
        ref.display();
        ref.work();  // Teacher version runs
        System.out.println();

        ref = new Person();
        ref.display();
        ref.work();  // Person version runs
    }
}
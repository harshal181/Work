//Q2. Design a class Employee with instance variables name, basicSalary, and a static variable companyBonusRate.
//Add a static method to change the bonus rate.
//Add a non-static method calculateTotalSalary() that calculates total salary as basicSalary + (basicSalary × companyBonusRate / 100).
class Employee{
String name;
double basicSalary;
static double companyBonusRate;

static void setcompanyBonusRate(double b){
companyBonusRate=b;
}

double calculateTotalSalary() {
return basicSalary + (basicSalary * companyBonusRate / 100);
}

Employee(String n,double b){
this.name=n;
this.basicSalary=b;
}

void display(){
System.out.println("Employee name="+this.name);
System.out.println("basic salary="+this.basicSalary);
System.out.println("company bonus rate="+companyBonusRate);
System.out.println("total salary="+calculateTotalSalary());
}
}

class TestEmployee{
public static void main(String[]args){
Employee.setcompanyBonusRate(5);
Employee e1=new Employee("amay Mishra",45890.200);
Employee e2=new Employee("vaibhav kumar",88870.600);
Employee e3=new Employee("karan gupta",50000.300);
e1.display();
e2.display();
e3.display();
}
}
class Student{
int rollno;
String name;
double percentage;

 Student(int rollno,String name,double percentage){
this.rollno=rollno;
this.name=name;
this.percentage=percentage;
}
}//class Student ends here;
class Employee{
int id;
String name;
double annualSalary;

 Employee(int id,String name,double annualSalary){
this.id=id;
this.name=name;
this.annualSalary=annualSalary;
}
}//class Employee ends here


class Bank{
void approvedloan(Student s){
System.out.println("Student name="+s.name);
System.out.println("student percentage="+s.percentage);
if(s.percentage>80){
System.out.println("loan approve  2 Lakh");
}
else if(s.percentage>60 &&  s.percentage<=80){
System.out.println("loan approve 1 Lakh");
}

else if(s.percentage>=40 && s.percentage<=60){
System.out.println("loan approve 50k");
}
else{
System.out.println("No loan approved");
}
}

void approvedloan(Employee e){
System.out.println("Employee name="+e.name);
System.out.println("Annual Salary="+e.annualSalary);

if(e.annualSalary>1200000){
System.out.println("loan approved 7 Lakh");
}
else if(e.annualSalary>=1000000 && e.annualSalary<=1200000){
System.out.println("loan approved 6 Lakh");
}

else if(e.annualSalary>=600000 && e.annualSalary<=1000000){
System.out.println("loan approve 5 Lakh");
}

else if(e.annualSalary>=400000 && e.annualSalary<=600000){
System.out.println("loan approve 4 Lakh");
}

else{
System.out.println("No loan approved");
}
}
}//class Bank ends here;
class TestBank{
public static void main(String[]args){
Student s1=new Student(12,"amey",45.8);
Student s2=new Student(34,"akshay",78);

Employee e1=new Employee(34,"abhijit",1200000);
Employee e2=new Employee(87,"dipak",4580000);

Bank b1=new Bank();
b1.approvedloan(s1);
b1.approvedloan(s2);

b1.approvedloan(e1);
b1.approvedloan(e2);



}//main ends here;; 
}//class TestBank ends here;


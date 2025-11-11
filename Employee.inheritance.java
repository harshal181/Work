class Employee{

int empid;
String name;
int age;
double salary;
String department;

void setempid(int e){
this.empid=e;
}
void setname(String n){
this.name=n;
}
void setage(int a){
this.age=a;
}
void setsalary(double s){
this.salary=s;
}

void setdepartment(String d){
this.department=d;
}

int getempid(){
return this.empid;
}

String getname(){
return this.name;
}

int getage(){
return this.age;
}

double getsalary(){
return this.salary;
}
String getdepartment(){
return this.department;
}
Employee(){
System.out.println("default constructor");
this.empid=12;
this.name="amay Mishra";
this.age=23;
this.salary=6000.80;
this.department="Not available";
}

Employee(int e,String n,int a,double s,String d){
this.empid=e;
this.name=n;
this.age=a;
this.salary=s;
this.department=d;
}

void display(){
System.out.println("emp id="+this.empid);
System.out.println("name="+this.name);
System.out.println("age="+this.age);
System.out.println("salary="+this.salary);
System.out.println("department="+this.department);

}

}
class HR extends Employee{

int requirementdone;
String hrlevel;

void setrequirementdone(int r){
this.requirementdone=r;
}

void sethrlevel(String l){
this.hrlevel=l;
}

int getrequirementdone(){
return this.requirementdone;
}

String gethrlevel(){
return this.hrlevel;
}

HR(){
super();
this.requirementdone=2;
this.hrlevel="Junior";
}

HR(int empid,String name,int age,double salary,String department,int rd,String hl){
super(empid,name,age,salary,department);
this.requirementdone=rd;
this.hrlevel=hl;
}
void display(){
super.display();
System.out.println("requirement done="+this.requirementdone);
System.out.println("hr level="+this.hrlevel);
}

}

class Manager extends Employee{
int teamsize;
String project;

void setteamsize(int t){
this.teamsize=t;
}
void setproject(String p){
this.project=p;
}

int getteamsize(){
return this.teamsize;
}

String getproject(){
return this.project;
}

Manager(){
super();
this.teamsize=2;
this.project="Java";
}

Manager(int empid,String name,int age,double salary,String department,int t,String p){
super(empid,name,age,salary,department);
this.teamsize=t;
this.project=p;
}
void display(){
super.display();
System.out.println("teamsize="+this.teamsize);
System.out.println("project="+this.project);
}
}
class Salesman extends Employee{
double salesamount;
double commission;

void setsalesamount(double s){
this.salesamount=s;
}

void setcommission(double c){
this.commission=c;
}

double getsalesamount(){
return this.salesamount;
}
double getcommission(){
return this.commission;
}

Salesman(){
super();
this.salesamount=708.20;
this.commission=200.2;
}

Salesman(int empid,String name,int age,double salary,String department,double s,double c){
super(empid,name,age,salary,department);
this.salesamount=s;
this.commission=c;
}

void display(){
super.display();
System.out.println("salesamount="+this.salesamount);
System.out.println("commission="+this.commission);

}

}

class TestEmployee{
public static void main(String[]args){
Employee e1=new Employee(101,"Amay gupta",23,2360.70,"Not available");
e1.display();
HR h1=new HR(202,"Ajinkya wankhede",40,5000.20,"HR",10,"Senior");
h1.display();
Manager m1=new Manager(708,"Virat Shah",50,5000.80,"Manager",10,"c++");
m1.display();
Salesman s1=new Salesman(202,"champak kutkutya",80,200.30,"Salesman",3450.5,200.8);
s1.display();

}
}
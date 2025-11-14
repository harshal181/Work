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

double calsalary(){
return this.salary;
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
int incentive;


void setrequirementdone(int r){
this.requirementdone=r;
}

void sethrlevel(String l){
this.hrlevel=l;
}
void setincentive(int w){
this.incentive=w;
}


int getrequirementdone(){
return this.requirementdone;
}

String gethrlevel(){
return this.hrlevel;
}
int getincentive(){
return this.incentive;
}


HR(){
super();
this.requirementdone=2;
this.hrlevel="Junior";
this.incentive=200;
}

HR(int empid,String name,int age,double salary,String department,int rd,String hl,int w){
super(empid,name,age,salary,department);
this.requirementdone=rd;
this.hrlevel=hl;
this.incentive=w;

}
double calsalary(){
return salary+incentive;
}

void display(){
super.display();
System.out.println("requirement done="+this.requirementdone);
System.out.println("hr level="+this.hrlevel);
System.out.println("incentive="+this.incentive);
System.out.println("total salary="+calsalary());
}

}

class Manager extends Employee{
int teamsize;
String project;
double allowance;

void setteamsize(int t){
this.teamsize=t;
}
void setproject(String p){
this.project=p;
}
void setallowance(double w){
this.allowance=w;
}


int getteamsize(){
return this.teamsize;
}

String getproject(){
return this.project;
}
double getallowance(){
return this.allowance;
}

Manager(){
super();
this.teamsize=2;
this.project="Java";
this.allowance=22.0;
}

Manager(int empid,String name,int age,double salary,String department,int t,String p,double y){
super(empid,name,age,salary,department);
this.teamsize=t;
this.project=p;
this.allowance=y;
}

double calsalary(){
return salary+allowance;
}

void display(){
super.display();
System.out.println("teamsize="+this.teamsize);
System.out.println("project="+this.project);
System.out.println("allowance="+this.allowance);
System.out.println("total salary="+calsalary());
}

}
class SalesManager extends Employee{
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

SalesManager(){
super();
this.salesamount=708.20;
this.commission=200.2;
}

SalesManager(int empid,String name,int age,double salary,String department,double s,double c){
super(empid,name,age,salary,department);
this.salesamount=s;
this.commission=c;
}

double calsalary(){
return salary+commission;
}

void display(){
super.display();
System.out.println("salesamount="+this.salesamount);
System.out.println("commission="+this.commission);
System.out.println("total salary="+calsalary());

}

}





class TestEmployee{
public static void main(String[]args){
Employee e1;
e1=new Employee(101,"Amay gupta",23,2360.70,"Not available");
e1.display();
e1=new HR(202,"Ajinkya wankhede",40,5000.20,"HR",10,"Senior",220);
e1.display();
 e1=new Manager(708,"Virat Shah",50,5000.80,"Manager",10,"c++",600.0);
e1.display();
 e1=new SalesManager(202,"champak kutkutya",80,200.30,"Salesmanager",3450.5,200.8);
e1.display();


}
}
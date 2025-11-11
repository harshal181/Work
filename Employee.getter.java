class Employee{
int id;
String name;
double salary;

void setid(int i){
this.id=i;
}
void setname(String n){
this.name=n;
}
void setsalary(double s){
this.salary=s;
}
int getid(){
return this.id;
}
String getname(){
return this.name;
}
double getsalary(){
return this.salary;
}
void display(){
System.out.println("Employee id="+this.id);
System.out.println("\nEmployee name="+this.name);
System.out.println("\nEmployee salary="+this.salary);
}

}//Employee class end here;

class TestEmployee{
public static void main(String[]args){
Employee e1=new Employee();
Employee e2=new Employee();
e1.setid(1);
e1.setname("amay");
e1.setsalary(34.500);
e2.setid(2);
e2.setname("amay");
e2.setsalary(22.500);
e1.display();
e2.display();


if(e1.getid()==e2.getid())
System.out.println("both are same id");
else
System.out.println("both are different id");

if(e1.getname()==e2.getname())
System.out.println("same name");
else
System.out.println("different name");

if(e1.getsalary()<e2.getsalary())
System.out.println("a2 salary is greater");
else
System.out.println("a1 salary is greater");


}//main end here;
}//TestEmployee end here;
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
Employee(){
this.id=101;
this.name="amay verma";
this.salary=20000;
}

Employee(int i,String n,double s){
this.id=i;
this.name=n ;
this.salary=s;

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
Employee e2=new Employee(12,"aniket gupta",34900);
e1.display();
e2.display();


}//main end here;
}//TestEmployee end here;
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
}//Employee class end here;

class TestEmployee{
public static void main(String[]args){
Employee e1=new Employee();
e1.setid(1);
e1.setname("amay");
e1.setsalary(34.500);


System.out.print("Employee id="+e1.id);
System.out.print("\nEmployee name="+e1.name);
System.out.print("\nEmployee salary="+e1.salary);

}//main end here;
}//TestEmployee end here;
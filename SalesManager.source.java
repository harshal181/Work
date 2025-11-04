class 	SalesManager{
int id;
String name;
double salary;
double incentive;
int target;

void setid(int i){
this.id=i;
}
void setname(String n){
this.name=n;
}
void setsalary(double s){
this.salary=s;
}
void setincentive(double i){
this.incentive=i;
}
void settarget(int t){
this.target=t;
}
}//SalesManager class end here;

class TestSalesManager{
public static void main(String[]args){
SalesManager a1=new SalesManager();
a1.setid(7890);
a1.setname("viral sharma");
a1.setsalary(87.230);
a1.setincentive(11.200);
a1.settarget(5);

System.out.print("Admin id="+a1.id);
System.out.print("\nsalesmanager name="+a1.name);
System.out.print("\nsalesmanager salary="+a1.salary);
System.out.print("\nsalesmanager incentive="+a1.incentive);
System.out.print("\nsalesmanager target="+a1.target);

}//main end here;
}//TestSalesmanagaer class end here;
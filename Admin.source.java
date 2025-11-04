class Admin{
int id;
String name;
double salary;
String allowance;

void setid(int i){
this.id=i;
}
void setname(String n){
this.name=n;
}
void setsalary(double s){
this.salary=s;
}
void setallowance(String a){
this.allowance=a;
}
}//Admin class end here;

class TestAdmin{
public static void main(String[]args){
Admin a1=new Admin();
a1.setid(6087);
a1.setname("Abhijit gupta");
a1.setsalary(55.800);
a1.setallowance("yes");

System.out.print("Admin id="+a1.id);
System.out.print("\nAdmin name="+a1.name);
System.out.print("\nAdmin salary="+a1.salary);
System.out.print("\nAdmin allowance="+a1.allowance);

}//main end here;
}//TestAdmin end here;
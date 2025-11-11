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
int getid(){
return this.id;
}
String getname(){
return this.name;
}
double getsalary(){
return this.salary;
}

String getallowance(){
return this.allowance;
}
Admin(){
this.id=12;
this.name="Akshay Mishra";
this.salary=45000;
this.allowance="yes";
}//default constructor ends here;

Admin(int i,String s,double y,String a){
this.id=i;
this.name=s;
this.salary=y;
this.allowance=a;
}

void display(){
System.out.print("Admin id="+this.id);
System.out.print("\nAdmin name="+this.name);
System.out.print("\nAdmin salary="+this.salary);
System.out.print("\nAdmin allowance="+this.allowance);
}

}//Admin class end here;

class TestAdmin{
public static void main(String[]args){
a1.display();
Admin a2=new Admin(125,"Amay verma",5700.0,"yes");
a2.display();


}//main end here;
}//TestAdmin end here;



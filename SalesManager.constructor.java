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
int getid(){
return this.id;
}
String getname(){
return this.name;
}
double getsalary(){
return this.salary;
}
double getincentive(){
return this.incentive;
}
int  gettarget(){
return this.target;
}
SalesManager(){
this.id=34;
this.name="Tanishq sharma";
this.salary=8976.50;
this.incentive=800;
this.target=10;
}
SalesManager(int i,String n,int s,int a,int t){
this.id=i;
this.name=n;
this.salary=s;
this.incentive=a;
this.target=t;

}
void display(){
System.out.print("Admin id="+this.id);
System.out.print("\nsalesmanager name="+this.name);
System.out.print("\nsalesmanager salary="+this.salary);
System.out.print("\nsalesmanager incentive="+this.incentive);
System.out.println("\nsalesmanager target="+this.target);
}


}//SalesManager class end here;

class TestSalesManager{
public static void main(String[]args){
SalesManager a1=new SalesManager();
SalesManager a2=new SalesManager(45,"Akshay Kale",34500,500,7);
a1.display();
a2.display();
        


}//main end here;
}//TestSalesmanagaer class end here;
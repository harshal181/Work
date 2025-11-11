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
SalesManager a2=new SalesManager();
a1.setid(7890);
a1.setname("viral sharma");
a1.setsalary(87.230);
a1.setincentive(11.200);

a2.settarget(8);
a2.setid(7890);
a2.setname("Abhi shukla");
a2.setsalary(45000);
a2.setincentive(2450.7);
a2.settarget(59);


    if (a1.getsalary() > a2.getsalary()) 
            System.out.println("a1 salary is grater");
        
      else 
            System.out.println("a2 salary is greater");

        // Incentive compare
        if (a1.getincentive() > a2.getincentive()) 
            System.out.println("a1 incentive is grater");
         else 
            System.out.println("a2 incentive is greater");
        

        // Target compare
        if (a1.gettarget() > a2.gettarget()) 
            System.out.println("a1 target is grater");
        else 
            System.out.println("a2 target is grater");
        


}//main end here;
}//TestSalesmanagaer class end here;
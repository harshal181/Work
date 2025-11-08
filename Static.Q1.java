//Q1. Design a class ElectricityBill with a static variable ratePerUnit. Each object will have customer details and number of units consumed. Use a static method to change the rate. 
//calculate bill using a non-static method.


class ElectricBill{
int id;
String name;
double totalunits;
static double rateperunits;


static void setrateperunits(double r){
rateperunits=r;
}

double calculatebill(){
return rateperunits*totalunits;
}
ElectricBill(int i,String n,double t){
this.id=i;
this.name=n;
this.totalunits=t;

}

void display(){
System.out.println("Customer id="+this.id);
System.out.println("Customer name="+this.name);
System.out.println("total units="+this.totalunits);
System.out.println("rate per unit="+rateperunits);
System.out.println("total bill="+calculatebill());
}
}

class TestElectricBill{
public static void main(String[]args){
ElectricBill.setrateperunits(7.5);

ElectricBill e1=new ElectricBill(1012,"Amay Gupta",75);
ElectricBill e2=new ElectricBill(4890,"Kishor kumar",120);
ElectricBill e3=new ElectricBill(27127,"Virat kohli",280);

e1.display();
e2.display();
e3.display();


}
}
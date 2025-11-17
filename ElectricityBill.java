
import java.util.*;
abstract class ElectricityBill{
int units;
String CustomerName;

void setunits(int u){
this.units=u;
}

void setCustomerName(String c){
this.CustomerName=c;
}
int getunits(){
return this.units;
}
String getCustomerName(){
return this.CustomerName;
}

void showusage(){
System.out.println("Customer Name="+this.CustomerName);
System.out.println("units="+this.units);
}

abstract double calculateBill();

final void  generateBill(){
double amount=calculateBill();
amount=amount+(amount*0.05);
amount=amount+50;
System.out.println(amount);
}

}



class ResidentialBill extends ElectricityBill{

double calculateBill(){

double amount=0;
if(this.units>=0 && this.units<=100){
amount=units*2.5;
}
else if(this.units>=101 && units<=300){
amount=units*3.5;
}
else if(this.units>300){
amount=units*5;
}

if(units>500){
amount=amount+150;
}

return amount;
}
}





class CommercialBill extends ElectricityBill{

double calculateBill(){
double perunit=units*6.5;
double amount=perunit;

if(units<200){
amount=1500;
}


if(units>1000){
double surcharge=perunit*0.08;
amount=amount+surcharge;
}


return amount;
}
}

class TestElectricityBill{
public static void main(String[]args){

Scanner obj1=new Scanner(System.in);

System.out.println("please 1.Residential or press 2.Commercial:");
int a=obj1.nextInt();

System.out.println("Enter the Customer name=");
String b=obj1.next();

System.out.println("Enter the units");
int c=obj1.nextInt();

ElectricityBill e1=null;

if(a==1){
e1=new ResidentialBill();
}

if(a==2){
e1=new CommercialBill();
}

e1.setCustomerName(b);
e1.setunits(c);

e1.generateBill();
e1.showusage();


}

}


class Car{
String model;
String brand;
double price;
String colour;
String fueltype;

void setmodel(String m){
this.model=m;
}
void setbrand(String b){
this.brand=b;
}
void setprice(double p){
this.price=p;
}
void setcolour(String cl){
this.colour=cl;
}
void setfueltype(String f){
this.fueltype=f;
}
String getmodel(){
return this.model;
}
String getbrand(){
return this.brand;
}
double getprice(){
return this.price;
}
String getcolour(){
return this.colour;
}
String getfueltype(){
return this.fueltype;
}
Car(){
this.model="toyato fortuner";
this.brand="toyato";
this.price=40000;
this.colour="red";
this.fueltype="petrol";
}//default constructor ends here;

Car(String m,String b,double p,String c,String f){
this.model=m;
this.brand=b;
this.price=p;
this.colour=c;
this.fueltype=f;
}//parameterized constructor ends here;

void display(){
System.out.print("car model="+this.model);
System.out.print("\ncar brand="+this.brand);
System.out.print("\ncar price="+this.price);
System.out.print("\ncar colour="+this.colour);
System.out.print("\ncar fueltype="+this.fueltype);
}

}//class Car ends here;

class TestCar{
public static void main(String[]args){
Car c1=new Car();
c1.display();

Car c2=new Car("BMW X5","BMW",45900,"White","Diesel");
c2.display();



}//main ends here;

}//class TestCar ends here;


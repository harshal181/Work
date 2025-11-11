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
Car c2=new Car();


c1.setmodel("fortuner");
c2.setmodel("m4 competition");
c1.setbrand("toyato");
c2.setbrand("BMW");
c1.setprice(55.890);
c2.setprice(56.800);
c1.setcolour("red");
c2.setcolour("white");
c1.setfueltype("petrol\n");
c2.setfueltype("petrol\n");

c1.display();
c2.display();


if (c1.getmodel()==c2.getmodel())
System.out.println("both car model are same");
else
System.out.println("both car model are different");

if (c1.getbrand()==c2.getbrand())
System.out.println("both car brand are same");
else
System.out.println("both car brand are different");

if(c1.getprice()<c2.getprice())
System.out.println("c2 car is costly");
else
System.out.println("c1 car is costly");

if (c1.getcolour()==c2.getcolour())
System.out.println("both car colour are same");
else
System.out.println("both car colour are different");


if (c1.getfueltype()==c2.getfueltype())
System.out.println("both car fueltype are same");
else
System.out.println("both car fueltype are different");


}//main ends here;

}//class TestCar ends here;


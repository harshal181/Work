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

}//class Car ends here;

class TestCar{
public static void main(String[]args){
Car c1=new Car();
c1.setmodel("fortuner");
c1.setbrand("toyato");
c1.setprice(55.890);
c1.setcolour("red");
c1.setfueltype("petrol");

System.out.print("car model="+c1.model);
System.out.print("\ncar brand="+c1.brand);
System.out.print("\ncar price="+c1.price);
System.out.print("\ncar colour="+c1.colour);
System.out.print("\ncar fueltype="+c1.fueltype);

}//main ends here;

}//class TestCar ends here;

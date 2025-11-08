class Shapes{

void area(double b,double h){
double d=0.5*b*h;
System.out.println("Area of Triangle="+d);
}

void area(int l,int  b){
double w=l*b;
System.out.println("Area of Rectangle="+w);
}

void area(double r){
double a=3.14*r*r;
System.out.println("Area of Circle="+a);
}

}//class Shapes ends here;

class TestShapes{
public static void main(String[]args){
Shapes s1=new Shapes();

s1.area(12.5,4.8);
s1.area(3,8);
s1.area(5.8);

}//main ends here;
}//class TestShapes ends here;

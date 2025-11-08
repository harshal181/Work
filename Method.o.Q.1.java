class Calculator{

void add(int a,int b){
int c=a+b;
System.out.println("add 1="+c);
}

void add(int a,double c){
double d=a+c;
System.out.println("add 2="+d);
}

void add(double a,int b){
double t=a+b;
System.out.println("add 3="+t);
}

void add(double w,double r){
double s=w+r;
System.out.println("add 4="+s);
}

void substract(int a,int b){
int c=a-b;
System.out.println("substract 1="+c);
}

void substract(int a,double c){
double d=a-c;
System.out.println("substract 2="+d);
}

void substract(double a,int b){
double t=a-b;
System.out.println("substract 3="+t);
}

void substract(double w,double r){
double s=w-r;
System.out.println("substract 4="+s);
}


void mul(int a,int b){
int c=a*b;
System.out.println("mul 1="+c);
}

void mul(int a,double c){
double d=a*c;
System.out.println("mul 2="+d);
}

void mul(double a,int b){
double t=a*b;
System.out.println("mul 3="+t);
}

void mul(double w,double r){
double s=w*r;
System.out.println("mul 4="+s);
}

void divide(int a,int b){
int c=a/b;
System.out.println("divide 1="+c);
}

void divide(int a,double c){
double d=a/c;
System.out.println("divide 2="+d);
}

void divide(double a,int b){
double t=a/b;
System.out.println("divide 3="+t);
}

void divide(double w,double r){
double s=w/r;
System.out.println("divide 4="+s);
}


}//class Calculator ends here;


class TestCalculator{
public static void main(String[]args){
Calculator c1=new Calculator();
c1.add(2,4);
c1.add(6,7.8);
c1.add(4.5,8);
c1.add(8.7,7.9);

c1.substract(8,7);
c1.substract(5,3.4);
c1.substract(8.7,8);
c1.substract(3.4,2.2);

c1.mul(23,4);
c1.mul(2,6.8);
c1.mul(3.5,8);
c1.mul(5.5,8.9);

c1.divide(10,2);
c1.divide(12,2.5);
c1.divide(25.8,8);
c1.divide(8.8,4.4);
}//main ends here;
}//class Calculator ends here;
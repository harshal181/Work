class Complex{
int real;
int imaginary;

void setreal(int r){
this.real=r;
}
void setimaginary(int i){
this.imaginary=i;
}
int getreal(){
return this.real;
}
int getimaginary(){
return this.imaginary;
}
void display(){
System.out.println("Complex number="+this.real+"i"+"+"+this.imaginary+"j");

}
}//class Complex end here;
class TestComplex{
public static void main(String[]args){
Complex c1=new Complex();
Complex c2=new Complex();
c1.setreal(1);
c2.setreal(2);
c1.setimaginary(5);
c2.setimaginary(10);
c1.display();
c2.display();

if(c1.getreal()<c2.getreal())
System.out.println("c2 real number is greater");
else
System.out.println("c1 real is greater");

if(c1.getimaginary()<c2.getimaginary())
System.out.println("c2 imaginary number is greater");
else
System.out.println("c2 imaginary number is greater");



}//main ends here;

}//class TestComplex ends here;

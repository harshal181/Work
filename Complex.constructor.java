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
Complex(){
this.real=5;
this.imaginary=8;
}//default constructor ends here;

Complex(int r,int i){
this.real=r;
this.imaginary=i;
}//parameterized constructor ends here;


void display(){
System.out.println("Complex number="+this.real+"i"+"+"+this.imaginary+"j");
}


}//class Complex ends here;

class TestComplex{
public static void main(String[]args){
Complex c1=new Complex();
c1.display();
Complex c2=new Complex(12,5);
c2.display();
}//main ends here;

}//class TestComplex ends here;

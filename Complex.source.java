class Complex{
int real;
int imaginary;

void setreal(int r){
this.real=r;
}
void setimaginary(int i){
this.imaginary=i;
}

}//class Complex ends here;

class TestComplex{
public static void main(String[]args){
Complex c1=new Complex();
c1.setreal(1);
c1.setimaginary(5);

System.out.println("Complex number="+c1.real+"i"+"+"+c1.imaginary+"j");

}//main ends here;

}//class TestComplex ends here;

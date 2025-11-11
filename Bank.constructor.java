class Book{
int ISBN;
String bname;
String Category;
double price;


Book{
this.ISBN=546756758;
this.bname="C Programming";
this.Category="Programming";
this.price=45600;
}/default constructor ends here;

Book(int i,String n,String c,double p){
this.ISBN=i;
this.bname=n;
this.Category=c;
this.price=d;
}/parameterized constructor ends here; constructor;


void display(){

System.out.print("Bank ISBN="+this.ISBN);
System.out.print("\nBank name="+this.bname);
System.out.print("\nBank Category="+this.category);
System.out.print("\nBank price="+this.price);
}

}

class TestBook{
public static void main(String[]args){
Book b1=new Book();
b1.display();
Book b2=new Book(126780,"Java","Programming",25000);
b2.display();

}
}
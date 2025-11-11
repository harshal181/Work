class Book{
int ISBN;
String bname;
String Category;
double price;

void setISBN(int i){
this.ISBN=i;
}

void setbname(String b){
this.bname=b;
}
void setCategory(String c){
this.Category=c;
}

void setprice(double p){
this.price=p;
}

int getISBN(){
return this.ISBN;
}

String getbname(){
return this.bname;
}

String getCategory(){
return this.Category;
}

double getprice(){
return this.price;
}


Book(){
this.ISBN=546756758;
this.bname="C Programming";
this.Category="Programming";
this.price=45600;
}//default constructor ends here;



Book(int i,String n,String c,double p){
this.ISBN=i;
this.bname=n;
this.Category=c;
this.price=p;
}//parameterized constructor ends here; constructor;


void display(){

System.out.print("Bank ISBN= - Book.constructor.java:58"+this.ISBN);
System.out.print("\nBank name= - Book.constructor.java:59"+this.bname);
System.out.print("\nBank Category= - Book.constructor.java:60"+this.Category);
System.out.println("\nBank price= - Book.constructor.java:61"+this.price);
}

}//Book class ends here;

class TestBook{
public static void main(String[]args){
Book b1=new Book();
b1.display();
Book b2=new Book(126780,"Java","Programming",25000);
b2.display();

}//main ends here;
}//class TestBook ends here;
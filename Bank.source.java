class Book{
int ISBN;
String bname;
String Category;
double price;

void setISBN(int i){
this.ISBN=i;
}
void setbname(String n){
this.bname=n;
}
void setcategory(String c){
this.category=c;
}
void setprice(double p){
this.price=p; 
}

}

class TestBook{
public static void main(String[]args){
Book b1=new Book();
b1.setISBN(7374);
b1.setbname("State bank of india);
b1.setcategory("distric level");
b1.setprice(34.800);

System.out.print("Bank ISBN="+b1.ISBN);
System.out.print("\nBank name="+b1.bname);
System.out.print("\nBank Category="+b1.category);
System.out.print("\nBank price="+b1.price);

}
}
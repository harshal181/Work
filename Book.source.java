class Book{
int ISBN;
String bname;
String category;
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

}//class Book end here;

class TestBook{
public static void main(String[]args){
Book b1=new Book();
b1.setISBN(7374);
b1.setbname("C programming");
b1.setcategory("pragramming");
b1.setprice(34.800);

System.out.print("Book ISBN="+b1.ISBN);
System.out.print("\nBook name="+b1.bname);
System.out.print("\nBook Category="+b1.category);
System.out.print("\nBook price="+b1.price);

}//main end here;

}//class TestBook end here;
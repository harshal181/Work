class Product{
int pid;
String pname;
double price;
int quantity;

void setpid(int p){
this.pid=p;
}
void setpname(String n){
this.pname=n;
}
void setprice(double p){
this.price=p;
}
void setquantity(int q){
this.quantity=q;
}

}//class Product end here;

class TestProduct{
public static void main(String[]args){

Product p1=new Product();
p1.setpid(206);
p1.setpname("moti soap");
p1.setprice(67.8);
p1.setquantity(4);

System.out.print("product id="+p1.pid);
System.out.print("\nproduct name="+p1.pname);
System.out.print("\nproduct price="+p1.price);
System.out.print("\nproduct quantity="+p1.quantity);


}//main end here;

}//class TestProduct end here;
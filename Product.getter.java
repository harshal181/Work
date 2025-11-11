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
int getpid(){
return this.pid;
}
String getpname(){
return this.pname;
}
double getprice(){
return this.price;
}
int getquantity(){
return this.quantity;
}
void display(){
System.out.println("product id="+this.pid);
System.out.println("\nproduct name="+this.pname);
System.out.println("\nproduct price="+this.price);
System.out.println("\nproduct quantity="+this.quantity);

}
}//class Product end here;

class TestProduct{
public static void main(String[]args){

Product p1=new Product();
Product p2=new Product();


p1.setpid(206);
p1.setpname("moti soap");
p1.setprice(100);
p1.setquantity(4);
p2.setpid(906);
p2.setpname("moti soap");
p2.setprice(125);
p2.setquantity(5);

p1.display();
p2.display();

if(p1.getpid()==p2.getpid())
System.out.println("both product id are same");
else
System.out.println("both product id are different");

if(p1.getpname().equals(p2.getpname()))
System.out.println("both product name are same");
else
System.out.println("both product name are differnt");

if(p1.getprice()<p2.getprice())
System.out.println("p2 is costly");
else
System.out.println("p1 is costly");

if(p1.getquantity()<p2.getquantity())
System.out.println("p2 product quantity is greater");
else
System.out.println("p1 product quantity is greater");

}//main end here;

}//class TestProduct end here;
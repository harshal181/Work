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
Product(){
this.pid=807;
this.pname="sugar";
this.price=40;
this.quantity=1;
}

Product(int p,String n,double w,int q){
this.pid=p;
this.pname=n;
this.price=w;
this.quantity=q;
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
Product p2=new Product(12,"Moti soap",40,2);
p1.display();
p2.display();


}//main end here;

}//class TestProduct end here;
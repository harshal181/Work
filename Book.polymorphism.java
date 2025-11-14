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

System.out.print("Bank ISBN="+this.ISBN);
System.out.print("\nBank name="+this.bname);
System.out.print("\nBank Category="+this.Category);
System.out.println("\nBank price="+this.price);
}
void showType(){
System.out.println("this is a general book");
}

}//Book class ends here;

class EBook extends Book{
double filesize;
String format;


void setfilesize(double f){
this.filesize=f;
}
void setformat(String f){
this.format=f;
}
double getfilesize(){
return this.filesize;
}
String getformat(){
return this.format;
}

EBook(){
super();
this.filesize=22.5;
this.format="pdf";
}

EBook(int i,String n,String c,double p,double f,String fr){
super(i,n,c,p);
this.filesize=f;
this.format=fr;
}
void display(){
super.display();
System.out.println("file size="+this.filesize);
System.out.println("format="+this.format);
}
void showType(){
System.out.println("this is E book");
}

}

class PrintedBook extends Book{
int pages;
String publisher;

void setpages(int p){
this.pages=p;
}
void setpublisher(String pb){
this.publisher=pb;
}

int getpages(){
return this.pages;
}
String getpublisher(){
return this.publisher;
}

PrintedBook(){
super();
this.pages=22;
this.publisher="kamlesh shah";
}
PrintedBook(int i,String n,String c,double p,int pg,String pb){
super(i,n,c,p);
this.pages=pg;
this.publisher=pb;
}

void display(){
super.display();
System.out.println("pages="+this.pages);
System.out.println("publisher="+this.publisher);
}
void showType(){
System.out.println("this is a printed book");
}
}

class TestBook{
public static void main(String[]args){

Book b1;

b1=new EBook(4242,"Ramayan","Gyan",30000,2.3,"pdf");
b1.display();
b1.showType();

b1=new PrintedBook(331323,"Artifical Intelligence","Machine Learning",40000,3000,"R.t.watt");
b1.display();
b1.showType();

}//main ends here;
}//class TestBook ends here;
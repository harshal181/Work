abstract class Book{
int ISBN;
String bname;
String Category;
double price;

abstract String Showtype();

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

String getCatgory(){
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

public String toString(){
return "ISBN="+this.ISBN+"\nBook name="+this.bname+"\nCategory="+this.Category+"\nprice="+this.price;
}
void display(){
System.out.println(this.toString());
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
String Showtype(){
return "this is E book";
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
String Showtype(){
return "printed book is a best book";
}

}

class TestBook{
public static void main(String[]args){

Book b1;

b1=new EBook(4242,"Ramayan","Gyan",30000,2.3,"pdf");
b1.display();
System.out.println(b1.Showtype());


b1=new PrintedBook(331323,"Artifical Intelligence","Machine Learning",40000,3000,"R.t.watt");
b1.display();
System.out.println(b1.Showtype());

}//main ends here;
}//class TestBook ends here;
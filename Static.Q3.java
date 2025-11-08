
class LibraryUser{
String name;
int daysLate;
static double fineperDay;

static void setfineperday(double f){
fineperDay=f;
}

double calculateFine(){
return daysLate*fineperDay;
}
LibraryUser(String n,int d){
this.name=n;
this.daysLate=d;
}

void display(){
System.out.println("Worker name="+this.name);
System.out.println("daysLate="+this.daysLate);
System.out.println("fine per day="+fineperDay);
System.out.println("total fine="+calculateFine());

}
}

class TestLibraryUser{
public static void main(String[]args){

LibraryUser.setfineperday(50.8);
LibraryUser l1=new LibraryUser("Amay Gupta",12);
LibraryUser l2=new LibraryUser("Kuldip kumar",15);
LibraryUser l3=new LibraryUser("Pradip shah",13);

l1.display();
l2.display();
l3.display();

}
}


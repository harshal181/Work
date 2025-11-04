class HR{
int id;
String name;
double salary;
int commision;

void setid(int i){
this.id=i;
}
void setname(String n){
this.name=n;
}
void setsalary(double s){
this.salary=s;
}
void setcommision(int c){
this.commision=c;
}

}//HR class end here;

class TestHR{
public static void main(String[]args){
HR h1=new HR();
h1.setid(908);
h1.setname("karan khanna");
h1.setsalary(78.6500);
h1.setcommision(800);

System.out.print("HR id="+h1.id);
System.out.print("\nHR name="+h1.name);
System.out.printf("\nHR salary=%f", h1.salary);
System.out.print("\nHR commision="+h1.commision);
}//main end here;
}//TestHR end here;
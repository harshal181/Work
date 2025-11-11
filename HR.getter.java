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
int getid(){
return this.id;
}
String getname(){
return this.name;
}
double getsalary(){
return this.salary;
}
int getcommision(){
return this.commision;
}

void display(){

System.out.println("HR id="+this.id);
System.out.println("HR name="+this.name);
System.out.println("HR salary="+this.salary);
System.out.println("HR commision="+this.commision);
}

}//HR class end here;

class TestHR{
public static void main(String[]args){
HR h1=new HR();
HR h2=new HR();
h1.setid(908);
h1.setname("karan khanna");
h1.setsalary(78.6500);
h1.setcommision(800);
h2.setid(108);
h2.setname("Abhijit khanna");
h2.setsalary(78.6500);
h2.setcommision(600);
h1.display();
h2.display();

if(h1.getid()==h2.getid())
System.out.println("both are same id");
else
System.out.println("both are different id");

if(h1.getname()==h2.getname())
System.out.println("same name");
else
System.out.println("different name");

if(h1.getsalary()<h2.getsalary())
System.out.println("h2 salary is greater");
else
System.out.println("h1 salary is greater");

if(h1.getcommision()<h2.getcommision())
System.out.println("h2 commision is high");
else
System.out.println("h1 commision is high");

}//main end here;
}//TestHR end here;
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
HR(){
this.id=120;
this.name="Vicky kumar";
this.salary=34.500;
this.commision=200;
}
HR(int i,String n,double s,int c){
this.id=i;
this.name=n;
this.salary=s;
this.commision=c;
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
h1.display();

HR h2=new HR(12,"Akshay Kunghatkar",23.800,400);
h2.display();


}//main end here;
}//TestHR end here;
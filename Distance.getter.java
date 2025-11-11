class Distance{
int km;
int m;

void setkm(int k){
this.km=k;
}
void setm(int i){
this.m=i;
}
int getkm(){
return this.km;
}
int getm(){
return this.m;
}

void display(){
System.out.println("Total Distance = " + this.km + " kilo meter and " + this.m + " meter");
}
}//class Distance ends here;

class TestDistance{
public static void main(String[]args){
Distance d1=new Distance();
Distance d2=new Distance();

d1.setkm(18);
d2.setkm(10);
d1.setm(4);
d2.setm(13);

d1.display();
d2.display();

if(d1.getkm()<d2.getkm())
System.out.println("d2 kilometer is greater");
else
System.out.println("d1 kilometer is greater");

if(d1.getm()<d2.getm())
System.out.println("d2 meter is greater");
else
System.out.println("d1 meter is greater");


}//main ends here;

}//class TestDistance ends here;

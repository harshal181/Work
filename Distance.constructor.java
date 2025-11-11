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
Distance(){
this.km=5;
this.m=10;
}

Distance(int a,int b){
this.km=a;
this.m=b;
}

void display(){
System.out.println("Total Distance = " + this.km + " kilo meter and " + this.m + " meter");
}
}//class Distance ends here;

class TestDistance{
public static void main(String[]args){
Distance d1=new Distance();
Distance d2=new Distance(10,3);
d1.display();
d2.display();

}//main ends here;

}//class TestDistance ends here;

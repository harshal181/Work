class Distance{
int km;
int m;

void setkm(int k){
this.km=k;
}
void setm(int i){
this.m=i;
}

}//class Distance ends here;

class TestDistance{
public static void main(String[]args){
Distance d1=new Distance();

d1.setkm(8);
d1.setm(4);
System.out.println("Total Distance = " + d1.km + " kilo meter and " + d1.m + " meter");

}//main ends here;

}//class TestDistance ends here;

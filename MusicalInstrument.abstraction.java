abstract class MusicalInstrument{
String name;
String brand;
String type;
int size;
double price;

abstract String play();
 


void setname(String n){
this.name=n;
}

void setbrand(String b){
this.brand=b;
}

void settype(String t){
this.type=t;
}
void setsize(int y){
this.size=y;
}



void setprice(double p){
this.price=p;
}

String getname(){
return this.name;
}
String getbrand(){
return this.brand;
}
int getsize(){
return this.size;
}

String gettype(){
return this.type;
}

double getprice(){
return this.price;
}

MusicalInstrument(){
this.name="unknown";
this.brand="unknown";
this.type="unknown";
this.size=12;
this.price=230.;
}

MusicalInstrument(String n,String b,String t,int y,double p){
this.name=n;
this.brand=b;
this.type=t;
this.size=y;
this.price=p;
}

public String toString(){
return "Name="+this.name+"\nBrande="+this.brand+"\nType="+this.type+"\nSize="+this.size+"\nPrice="+this.price;
}

void display(){
System.out.println(this.toString());
}



}
class Piano extends MusicalInstrument{
int numberofKeys;
boolean isElectric;

void setnumberofKeys(int n){
this.numberofKeys=n;
}

void setisElectric(boolean e){
this.isElectric=e;
}

int getnumberofKeys(){
return this.numberofKeys;
}
boolean getisElectric(){
return this.isElectric;
}

Piano(){
super();
this.numberofKeys=12;
this.isElectric=true;
}

Piano(String n,String b,String t,int y,double p,int k,boolean i){
super(n,b,t,y,p);
this.numberofKeys=k;
this.isElectric=i;
}

void display(){
System.out.println("Piano Display:");
super.display();
System.out.println("Number of keys="+this.numberofKeys);
System.out.println("Is Electric="+this.isElectric);
}

String play(){
return "playing the piano keys melodiously..";
}
}

class Guitar extends MusicalInstrument{
int numberofStrings;
boolean isAcoustic;

void setnumberofString(int s){
this.numberofStrings=s;
}
void setisAcoustic(boolean a){
this.isAcoustic=a;
}

int getnumberofStrings(){
return this.numberofStrings;
}

boolean getisAcoustic(){
return this.isAcoustic;
}

Guitar(){
super();
this.numberofStrings=12;
this.isAcoustic=false;
}
Guitar(String n,String b,String t,int y,double p,int w,boolean a){
super(n,b,t,y,p);
this.numberofStrings=w;
this.isAcoustic=a;
}

void display(){
System.out.println("Guitar Display:");
super.display();
System.out.println("Number of Strings="+this.numberofStrings);
System.out.println("Is Acoustic="+this.isAcoustic);
}
String play(){
return "play a guitar";
}

}

class Flute extends MusicalInstrument{
String materials;
int numberofHoles;

void setmaterials(String m){
this.materials=m;
}

void setnumberofHoles(int q){
this.numberofHoles=q;
}

String getmaterials(){
return this.materials;
}

int getnumberofHoles(){
return this.numberofHoles;
}

Flute(){
super();
this.materials="unknown";
this.numberofHoles=20;
}

Flute(String n,String b,String t,int y,double p,String q,int u){
super(n,b,t,y,p);
this.materials=q;
this.numberofHoles=u;
}

void display(){
System.out.println("Flute Display:");
super.display();
System.out.println("Materials="+this.materials);
System.out.println("Number of Holes="+this.numberofHoles);
}
String play(){
return "Blowing air into the flute to create soft notes..";
}

}

class TestMusicalInstrument{
public static void main(String[]args){


MusicalInstrument m1;



 m1=new Piano("Piano","Tata","Keyboard",45,550.0,12,true);
m1.display();
System.out.println(m1.play());

 m1=new Guitar("Guitar","Adani","String",48,622.0,49,true);
m1.display();
System.out.println(m1.play());

 m1=new Flute("Flute","Ambani","Wind",23,23.4,"wood",12);
m1.display();
System.out.println(m1.play());
}
}

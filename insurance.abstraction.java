abstract class InsurancePolicy{
String policyHolderName;
double basePremium;

abstract double CalculatePremium();

void setpolicyHoldername(String p){
this.policyHolderName=p;
}
void setbasePremium(double b){
this.basePremium=b;
}

String getpolicyHolderName(){
return this.policyHolderName;
}

double getbasePremium(){
return this.basePremium;
}

InsurancePolicy(String a,double y){
this.policyHolderName=a;
this.basePremium=y;
}

void display(){
System.out.println("Policy holder name="+this.policyHolderName);
System.out.println("Base premium="+this.basePremium);
}
}

class CarInsurance extends InsurancePolicy{
int carAgeInYears;
boolean hadAccidentInLastYear;
int carValue;

void setcarAgeInYears(int a){
this.carAgeInYears=a;
}

void sethadAccidentInLastYear(boolean l){
this.hadAccidentInLastYear=l;
}

void setcarValue(int s){
this.carValue=s;
}

int getcarAgeInYears(){
return this.carAgeInYears;
}

boolean gethadAccidentInLastYear(){
return this.hadAccidentInLastYear;
}

int getcarValue(){
return this.carValue;
}



CarInsurance(String a,double y,int l,boolean w,int t){
super(a,y);
this.carAgeInYears=l;
this.hadAccidentInLastYear=w;
this.carValue=t;
}
double CalculatePremium(){

double Premium=basePremium;

if(carAgeInYears<=3){
Premium=Premium+(Premium*0.10);
}

else if(carAgeInYears>=4 && carAgeInYears<=7){
Premium=Premium+(Premium*0.20);
}

else if(carAgeInYears>7){
Premium=Premium+(Premium*0.30);
}

if(hadAccidentInLastYear==true){
Premium=Premium+(Premium*0.25);
}

else{
Premium=Premium-(Premium*0.10);
}

if (carValue>1000000){
Premium=Premium+2000;
}
return Premium;
}

void display(){
super.display();
System.out.println("car age="+this.carAgeInYears);
System.out.println("accident in last year="+this.hadAccidentInLastYear);
System.out.println("car value="+this.carValue);
System.out.println("car base premium="+CalculatePremium());
}

}

class HealthInsurance extends InsurancePolicy{
int age;
boolean isSmoker;
boolean hasPreExistingDisease;

 void setAge(int age) {
        this.age = age;
    }

    void setIsSmoker(boolean isSmoker) {
        this.isSmoker = isSmoker;
    }

    void setHasPreExistingDisease(boolean hasPreExistingDisease) {
        this.hasPreExistingDisease = hasPreExistingDisease;
    }


    int getAge() {
        return this.age;
    }

    boolean getIsSmoker() {
        return this.isSmoker;
    }

    boolean getHasPreExistingDisease() {
        return this.hasPreExistingDisease;
    }

    HealthInsurance(String a,double y,int age, boolean isSmoker, boolean hasPreExistingDisease) {
        super(a,y);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

double CalculatePremium(){
double p=basePremium;

if(age<30){
p=p+(p*0.10);
}
else if(age>=30 && age<=45){
p=p+(p*0.25);
}
else if(age >45){
p=p+(p*0.40);
}
 if(isSmoker==true){
p=p+(p*0.30);
}
else if(isSmoker==false){
p=p-(p*0.05);
}
 if(hasPreExistingDisease==true){
p=p+(p*0.20);
}
return p;
}
void display(){
super.display();
System.out.println("human age="+this.age);
System.out.println("is smoker="+this.isSmoker);
System.out.println("has preexisting disease="+this.hasPreExistingDisease);
System.out.println("total premium="+CalculatePremium());
}

}

class TestMain{
public static void main (String[]args){
InsurancePolicy i1;
i1=new CarInsurance("Amay Darne",20000.00,20,true,30000);
i1.display();

i1=new HealthInsurance("Abhijit kanaskar",700000.00,23,true,true);
i1.display();

}
}
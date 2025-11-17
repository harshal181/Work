

abstract class OnlinePayment{
int paymentID;
double amount;
String payerName;
String status;

void setpaymentId(int p){
this.paymentID=p;
}
void setamount(double a){
this.amount=a;
}
void setpayerName(String n){
this.payerName=n;
}
void setstatus(String s){
this.status=s;
}

int getpaymentId(){
return this.paymentID;
}

double getamount(){
return this.amount;
}

String getpayerName(){
return this.payerName;
}

String getstatus(){
return this.status;
}

void printSummary(){
System.out.println("Payment ID="+this.paymentID);
System.out.println("Amount="+this.amount);
System.out.println("Payer Name="+this.payerName);
System.out.println("Status="+this.status);
}

final void process(){
if(validate()){
deductAmount();
sendNotification();
this.status="Success";
}
else{
this.status="failed";
}
}
abstract boolean validate();
abstract void deductAmount();
abstract void sendNotification();
}

 
class CardPayment extends OnlinePayment{
String cardNumber;
int cvv;

void setcardNumber(String y){
this.cardNumber=y;
}

void setcvv(int u){
this.cvv=u;
}

String getcardNumber(){
return this.cardNumber;
}

int getcvv(){
return this.cvv;
}


boolean validate(){
if(cardNumber==null || cardNumber.length()!=16){
System.out.println("Invalid Card Number");
return false;
}
else if(cvv<100 || cvv>999){
System.out.println("Invalid cvv");
return false;
}

else if(amount<=0){
System.out.println("Invalid number");


return false;
}
return true;
}

void deductAmount(){
System.out.println("amount deducation");
}

void sendNotification(){
System.out.println("Notification");
}
}




class UPIPayment extends OnlinePayment{
String upiId;

void setupiId(String w){
this.upiId=w;
}

String  getupiId(){
return this.upiId;
}

boolean validate(){
if(upiId==null || !upiId.contains("@")){
System.out.println("Invalid Upi");
return false;
}
else if(amount<1 || amount>100000){
System.out.println("Invalid amount please provide amount between 1 and 100000");
return false;
}
return true;
}

void deductAmount(){
System.out.println("Amount deduction");
}

void sendNotification(){
System.out.println("Notification");
}
}


class TestPayment{
public static void main(String[]args){

CardPayment  c1=new CardPayment ();
c1.setpaymentId(675559);
c1.setamount(34500.0);
c1.setpayerName("amay darne");

c1.setcardNumber("0098776655442345");
c1.setcvv(334);
c1.process(); 
c1.printSummary();
System.out.println("--------------------");

UPIPayment u1=new UPIPayment();

u1.setpaymentId(8809809);
u1.setamount(22800.0);
u1.setpayerName("Abhay gayakwad");
u1.setupiId("bb@w");
u1.process();
u1.printSummary();
System.out.println("--------------------");

CardPayment c2 = new CardPayment();
c2.setpaymentId(123456);
c2.setamount(0);  
c2.setpayerName("Mohit Sharma");
c2.setcardNumber("8888765678987656");
c2.setcvv(123);
c2.process();
c2.printSummary();
System.out.println("--------------------");

 UPIPayment u2 = new UPIPayment();
u2.setpaymentId(998877);
u2.setamount(500000);  
 u2.setpayerName("amit Sharma");
u2.setupiId("amitupi");  
 u2.process();
 u2.printSummary();
}
}


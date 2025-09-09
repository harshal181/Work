//2. Convert Ass_3 program into functions with four types of function.(Excluding rangeprograms) .
//convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//9 Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

#include<stdio.h>
void strong1();
void strong2(int);
int strong3();
int strong4(int);

void main(){
	printf("without parameter & without return type:");
	strong1();
	printf("\nwith parameter & without return type:");
	int n;
    printf("Enter the n:");
    scanf("%d",&n);   
    strong2(n);
    printf("\nwithout parameter & with return type:");
    int res=strong3();
    if(res==1)
    printf("strong");
    else
    printf("not strong");
    
    printf("\nwith parameter & with return type:");
    int x;
    printf("Enter the x:");
    scanf("%d",&x);
    int check=strong4(x);
    if(check==1)
    printf("strong");
    else
    printf("not strong");
}
void strong1(){


int n;
printf("Enter the n:");
scanf("%d",&n);
int temp=n;
int sum=0;

while(temp>0){
	int b=temp%10;
	int a=1;
	for(int i=1;i<=b;i++){
		a=a*i;
	}
	sum=sum+a;
	temp=temp/10;
}
if(n==sum)
printf("strong");
else
printf("not strong");

}
 
 void strong2(int n){
 int temp=n;
int sum=0;

while(temp>0){	
	int b=temp%10;
	int a=1;
	for(int i=1;i<=b;i++){
		a=a*i;
	}
	sum=sum+a;
	temp=temp/10;
}
if(n==sum)
printf("strong");
else
printf("not strong");
 }
 
int strong3(){
	
int n;
printf("Enter the n:");
scanf("%d",&n);
int temp=n;
int sum=0;

while(temp>0){
	int b=temp%10;
	int a=1;
	for(int i=1;i<=b;i++){
		a=a*i;
	}
	sum=sum+a;
	temp=temp/10;
}
if(n==sum)
return 1;
else
return 0;
}
 
int strong4(int n){
 
int temp=n;
int sum=0;

while(temp>0){
	int b=temp%10;
	int a=1;
	for(int i=1;i<=b;i++){
		a=a*i;
	}
	sum=sum+a;
	temp=temp/10;
}
if(n==sum)
return 1;
else
return 0;
 }
 
 
 
 
 
 

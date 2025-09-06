//2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) . 
//convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//6 Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

#include<stdio.h>
void perfect1();
void perfect2(int);
int perfect3();
int perfect4(int);

void main(){
	printf("without parameter & without return type:");
	perfect1();
	printf("\nwith parameter & without return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	perfect2(a);
	
	printf("\nwithout parameter & with return type:");
	int result=perfect3();
	if(result==1)
	 printf("perfect");
	 else
	 printf("not perfect");
	 
	 printf("\nwith parametr & with return type:");
	 int x;
	 printf("Enter the x:");
	 scanf("%d",&x);
	 int check=perfect4(x);
	 if(check==1)
	 printf("perfect");
	 else
	 printf("not perfect");
	 
}
void perfect1(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int sum=0;
	for(int i=1;i<a;i++){
		
		if(a%i==0)
		sum=sum+i;
	}
	if(a==sum)
	printf("perfect");
	else
	printf("not perfect");
}
void perfect2(int a){
	
	int sum=0;
	for(int i=1;i<a;i++){	
		if(a%i==0)
		sum=sum+i;
	}
	if(a==sum)
	printf("perfect");
	else
	printf("not perfect");
	
}
int perfect3(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int sum=0;
	for(int i=1;i<a;i++){
		
		if(a%i==0)
		sum=sum+i;
	}
	if(a==sum)
	return 1;
	else
	return 0;
}
int perfect4(int a){
	int sum=0;
	for(int i=1;i<a;i++){
		
		if(a%i==0)
		sum=sum+i;
	}
	if(a==sum)
	return 1;
	else
	return 0;
	
}
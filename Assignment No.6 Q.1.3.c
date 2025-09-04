////1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//3. Write a program to check whether a given year is a leap year.

#include<stdio.h>
void leapyear1();
int leapyear2();
void leapyear3(int);
int leapyear4(int);

void main(){
	printf("Without parameter & without return type:");
	 leapyear1();
	
	
	printf("\n without parameter & with return type:");
	int res=leapyear2();
	if(res==1)
	printf("Leap year");
	else
	printf("Not Leap year");
	
	printf("\n with parameter & without return type:");
	int year;
	printf("Enter the year:");
	scanf("%d",&year);
	leapyear3(year);
	
		printf("\nwith parameter & with return type:");
		int a;
		printf("Enter the a:");
		scanf("%d",&a);
		int check=leapyear4(a);
		if(check==1)
		printf("Leap year");
		else
		printf("Not Leap year");
}
void leapyear1(){
	int year;
	printf("Enter the year:");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
		printf("Leap year");
	else
	 printf("Not leap year");
	}

int leapyear2(){
	int year;
	printf("Enter the year:");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
	   return 0;
}
void leapyear3(int x){
 	if(x%4==0 && x%100!=0 || x%400==0)
		printf("Leap year");
	else
	 printf("Not leap year");
	}	
	
	int leapyear4(int b){
			if(b%4==0 && b%100!=0 || b%400==0)
		return 1;
	else
	   return 0;
	}
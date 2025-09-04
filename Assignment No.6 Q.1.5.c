//1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//5. Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
void eligible1();
void eligible2(int);
int eligible3();
int eligible4(int);

void main(){
	printf("without parameter & without return type:");
	eligible1();
	
	printf("\n with parameter & without return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	eligible2(a);
	
	printf("\n without parameter &with return type");
	int result=eligible3();
	if(result==1)
	printf("eligible to vote");
	else
	printf("not eligible to vote:");
	
	printf("\n with parameter & with return type:");
	int check;
	printf("Enter the age:");
	scanf("%d",&check);
	int res=eligible4(check);
	if(res==1)
	printf("eligible to vote");
	else
	printf("not eligible to vote");
}
void eligible1(){
	int age;
	printf("Enter the age:");
	scanf("%d",&age);
	
	if(age>=18)
	printf("eligible to vote");
	else
	printf("not eligible to vote");
}
void eligible2(int b){
	if(b>=18)
	printf("eligible to vote");
	else
	printf("not eligible to vote");
}
int eligible3(){
	int b;
	printf("enter the b:");
	scanf("%d",&b);
	
	if(b>=18)
	 return 1;
	 else
	 return 0;
}
int eligible4(int a){
	if(a>=18)
	return 1;
	else
	return 0;
}
//1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//1. Write a program to check whether a number is even or odd.
#include<stdio.h>
void evenodd1();
int evenodd2();
void evenodd3(int);
int evenodd4(int);

void main(){
	printf("Without parameter & without return type:");
	evenodd1();
	
	printf("\n without parameter & with return type:");
	 int result=evenodd2();
	 if(result==1)
	 printf("even");
	 else
	 printf("odd");
	
	printf("\n with parameter & without return type:");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	evenodd3(n);
	
	printf("\nwith parameter & with return type:");
	int c;
	printf("Enter the c:");
	scanf("%d",&c);
	int res=evenodd4(c);
	if(res==1)
	printf("even");
	else
	printf("odd");
}
void evenodd1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	if(n%2==0)
	printf("even");
	else
	printf("odd");
}

int evenodd2(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	if(n%2==0)
	return 1;
	else
	return 0;
	
}
void evenodd3(int a){
	if(a%2==0)
	printf("even");
	else
	printf("odd");
}
   int evenodd4(int b){
   	if(b%2==0)
   	return 1;
   	else
   	return 0;
   }
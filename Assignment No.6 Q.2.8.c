//2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) . 
//convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.


//8 Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)

#include<stdio.h>
void sum1();
void sum2(int);
int sum3();
int sum4(int);

void main(){
	printf("without parameter & without return type:");
	sum1();
	printf("\nwith parameter & without return type:");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	sum2(n);
	printf("\nwithout parameter & with return type:");
	int res=sum3();
	printf("sum= %d",res);
	
	printf("\nwith parameter & with return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	int check=sum4(a);
	printf("sum= %d",check);
}
void sum1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	int temp=n;
	int sum=0;
	int a=n%10;
	while(temp>=10){
	temp=temp/10;
}
	sum=a+temp;
	printf("sum= %d",sum);
}

void sum2(int n){
	int temp=n;
	int sum=0;
	int a=n%10;
	while(temp>=10){
	temp=temp/10;
}
	sum=a+temp;
	printf("sum= %d",sum);
	
}

int sum3(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	int temp=n;
	int sum=0;
	int a=n%10;
	while(temp>=10){
	temp=temp/10;
}
	sum=a+temp;
	return sum;
}
int sum4(int n){
		int temp=n;
	int sum=0;
	int a=n%10;
	while(temp>=10){
	temp=temp/10;
}
	sum=a+temp;
	return sum;
}
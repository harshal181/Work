////2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) .
// convert range programs into two type of function i.e. w/o parameter, w/o return type and 
// with parameter and w/o return type.




//3 Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

#include<stdio.h>
void sum1();
void sum2(int,int);

void main(){
	printf("w/o parameter, w/o return type ");
	sum1();
	
	printf("\n with parameter and w/o return type ");
	int a,b;
	printf("Enter the start:");
	scanf("%d",&a);

	printf("Enter the end:");
	scanf("%d",&b);
	sum2(a,b);
}

void sum1(){
	int a,b;
	printf("Enter the start:");
	scanf("%d",&a);
	
	
	printf("Enter the end:");
	scanf("%d",&b);
	
	int sum=0;
	while(b>=a){
		sum=sum+a;
		a++;
		
	}
	printf("sum= %d",sum);
}

void sum2(int x,int y){
	int sum=0;
	while(y>=x){
		sum=sum+x;
		x++;
		
	}
	printf("sum= %d",sum);
}

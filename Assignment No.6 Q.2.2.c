//2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) .
// convert range programs into two type of function i.e. w/o parameter, w/oreturn type and 
// with parameter and w/o return type.


//2 Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>
void table1();
void table2(int);

void main(){
	printf("w/o parameter, w/oreturn type");
	table1();
	
	printf("\n with parameter and w/o return type");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	table2(n);
}

void table1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int b;
	for(int i=1;i<=10;i++){
		b=n*i;
		printf("%d ",b);
		
	}
}

void table2(int c){
	int d;
	for(int i=1;i<=10;i++){
		d=c*i;
		printf("%d ",d);
		
	}
}

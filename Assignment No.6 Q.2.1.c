//2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) .
// convert range programs into two type of function i.e. w/o parameter, w/oreturn type and 
// with parameter and w/o return type.


//1. Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10

#include<stdio.h>
void check1();
void check2(int);

void main(){
	printf("w/o parameter, w/oreturn type ");
	check1();
	
	printf("\nwith parameter and w/o return type ");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	check2(n);
}
void check1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		printf("%d ",i);
	}
}


void check2(int a){
	for(int i=1;i<=a;i++){
		printf("%d ",i);
	}
}
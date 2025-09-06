//2. Convert Ass_3 program into functions with four types of function.(Excluding range programs) . 
//convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//7 Find factorial of given number.
//Input: n = 5
//Output: 120

#include<stdio.h>
void factorial1();
void factorial2(int);
int factorial3();
int factorial4(int);

void main(){
	printf("without parameter & without retun type:");
	factorial1();
	printf("\nwith parameter & without return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	factorial2(a);
	
	printf("\nwithout parameter & with return return type:");
	int res=factorial3();
	printf("factorial= %d",res);
	
	printf("\nwith parameter & with return type:");
	int x;
	printf("Enter the x:");
	scanf("%d",&x);
	int check=factorial4(x);
	printf("factorial=%d",check);
	
}
void factorial1(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	int fact=1;
    int i=1;
    
    while(i<=a){
    	fact=fact*i;
    	i++;
	}
    printf("factorial= %d",fact);
}

void factorial2(int a){
	int i=1;
	int fact=1;
	while(i<=a){
		fact=fact*i;
		i++;
	}
	printf("factorial= %d",fact);
}
int factorial3(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	int i=1;
	int fact=1;
	while(i<=a){
		fact=fact*i;
		i++;
	}
	return fact;
}
	
int factorial4(int a){
	int i=1;
	int fact=1;
	while(i<=a){
		fact=fact*i;
		i++;
	}
	return fact;
}

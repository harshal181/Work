//2. Convert Ass_3 program into functions with four types of function.(Excluding rangeprograms) .
// convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//5 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong

#include<stdio.h>
void armstrong1();
void armstrong2(int);
int armstrong3();
int armstrong4(int);

void main(){
	printf("without parameter & without return type:");
	armstrong1();
	
	printf("\nwith parameter & without return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	armstrong2(a);
	
	printf("\nwithout parameter & with return type:");
	int res=armstrong3();
	if(res==1)
	printf("armstrong");
	else
	printf("not armstrong");
	
	printf("\nwith parameter & with return type:");
	int x;
	printf("Enter the x:");
	scanf("%d",&x);
	
	int check=armstrong4(x);
	if(check==1)
	printf("armstrong");
	else
	printf("not armstrong");
	
}
void armstrong1(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int temp=a;
	int sum=0;
	int check=sum;
	while(temp>0){
		int b=temp%10;
	      check=check+b*b*b;
		temp=temp/10;
	}
	if(a==check)
	printf("armstrong");
	else
	printf("not armstrong");
}

void armstrong2(int a){
	
	int temp=a;
	int sum=0;
	int check=sum;
	while(temp>0){
		int b=temp%10;
	      check=check+b*b*b;
		temp=temp/10;
	}
	if(a==check)
	printf("armstrong");
	else
	printf("not armstrong");
}
int armstrong3(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int temp=a;
	int sum=0;
	int check=sum;
	while(temp>0){
		int b=temp%10;
	      check=check+b*b*b;
		temp=temp/10;
	}
	if(a==check)
     return 1;
	else
	return 0;
}


int armstrong4(int a){
	int temp=a;
	int sum=0;
	int check=sum;
	while(temp>0){
		int b=temp%10;
	      check=check+b*b*b;
		temp=temp/10;
	}
	if(a==check)
	return 1;
	else
	return 0;
}
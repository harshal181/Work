//2. Convert Ass_3 program into functions with four types of function.(Excluding rangeprograms) . 
//convert range programs into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//4 Check the given number is prime or not.
//Input: n = 7
//Output: Prime

#include<stdio.h>
void prime1();
void prime2(int);
int prime3();
int prime4(int);
void main(){
	printf("without parameter & without return type:");
	prime1();
	printf("\nwith parameter & without return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	prime2(a);
	
	printf("\nwithout parameter& with return type:");
	int res=prime3();
	if(res==1)
	printf("prime");
	else
	printf("not prime");
	
	printf("\nwith parameter & without return type");
	int x;
	printf("Enter the x:");
	scanf("%d",&x);
	int check=prime4(x);
	if(check==1)
	printf("prime");
	else
	printf("not prime");
}
void prime1(){
	int a,flag=0;
	printf("Enter the a:");
	scanf("%d",&a);
	
	for(int i=2;i<a;i++){
	   	flag==0;
		if(a%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0)
	printf("prime");
	else
	printf("not prime");

}
void prime2(int a){
	int flag=0;
	
	for(int i=2;i<a;i++){
		flag==0;
		if(a%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0)
	printf("prime");
	else
	printf("not prime");
}
int prime3(){
	int a,flag=0;
	printf("Enter the a:");
	scanf("%d",&a);
	
	for(int i=2;i<a;i++){
		 flag==0;
		if(a%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0)
	return 1;
	else
	return 0;
}
int prime4(int a){
	int flag=0;
	
	for(int i=2;i<a;i++){
		flag==0;
		if(a%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0)
	return 1;
	else
	return 0;
	
}
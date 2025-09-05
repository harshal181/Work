
//.3. Convert Ass_4 into two type of function i.e. w/o parameter, w/o return type and 
//with parameter and w/o return type.
//1. Print armstrong numbers in the given range 1 to n.

#include<stdio.h>
void armstrong1();
void armstrong2(int);
void main(){
printf("w/o parameter, w/o return type");
armstrong1();
printf("\n with parameter and w/o return type");
int n;
printf("Enter the n:");
scanf("%d",&n);
armstrong2( n);
}

void armstrong1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	int i,j;
	for(i=1;i<=n;i++){
		int temp=i;
		int sum=0;
		while(temp>0){
		int a=temp%10;
		sum=sum+a*a*a;
		temp=temp/10;
	}
	if(i==sum){
		printf("%d ",i);
	}
	
}
}




void armstrong2(int b){

	int i;

	for(int i=1;i<=b;i++){
		int temp=i;
		int sum=0;
	while(temp>0){
		int a=temp%10;
		sum=sum+a*a*a;
		temp=temp/10;
	}
	if(i==sum){
		printf("%d ",i);
	}
	}
}


//3. Convert Ass_4 into two type of function i.e. w/o parameter, w/o return type and 
//with parameter and w/o return type.

//Print perfect numbers in the given range 1 to n.

#include<stdio.h>
void perfect1();
void perfect2(int);
void main(){
	printf("w/o parameter, w/o return type ");
	perfect1();
	
	printf("\nwith parameter and w/o return type ");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	perfect2(n);
}
void perfect1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int i,j;
	for(i=1;i<=n;i++){
		int sum=0;
		for(j=1;j<i;j++){
			if(i%j==0){
				sum=sum+j;
			}
		}
		if(i==sum)
		printf("%d ",i);
	}
	
}



void perfect2(int a){
	int i,j;
	int sum;
	for(i=1;i<=a;i++){
		int sum=0;
		for(j=1;j<i;j++)
			if(i%j==0)
				sum=sum+j;
			
		if(i==sum)
			printf("%d ",i);

	
}
}
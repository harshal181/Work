//3. Convert Ass_4 into two type of function i.e. w/o parameter, w/o return type and 
//with parameter and w/o return type.

// Print prime numbers in the given range 1 to n.
#include<stdio.h>
void prime1();
void prime2(int);
void main(){
	printf("w/o parameter, w/o return type ");
	 prime1();
	
	printf("\nwith parameter and w/o return type ");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	 prime2(n);
}

void prime1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int i,j;
	int flag=0;
	for(i=2;i<=n;i++){
		flag=0;
		for (j=2;j<i;j++){
			if(i%j==0){
				flag=1;
				break;
			}
		}
	  if(flag==0)
	  printf("%d ",i);
		
	}
}

void prime2(int a){
	int i,j;
	int flag=0;
	for(i=2;i<=a;i++){
		flag=0;
	
		for(j=2;j<i;j++)
			if(i%j==0){
				flag=1;
				break;
			}
		
	
		if(flag==0){
			printf(" %d ",i);
		
	}
	}}

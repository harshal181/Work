//1. Print armstrong numbers in the given range 1 to n.

#include<stdio.h>
void main(){
int n;
printf("Enter the n:");
scanf("%d",&n);

for(int i=1;i<n;i++){
	int temp=i;
      	int sum=0;
	
	while(temp>0){
	
		int c=temp%10;
	   sum=sum+c*c*c;
		temp=temp/10;
	}
	if(i==sum){
		printf("%d ",i);
	}
}



}

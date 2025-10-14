//1.
#include<stdio.h>
void main(){
	int a;
	printf("Enter the number:");
	scanf("%d",&a);
	long long sum=0;
	
for(int i=1;i<=a;i++){
	int fact=1;
	for(int j=1;j<=i;j++){
		fact=fact*j;
	}
	int temp=fact;
	while(temp>0){
		int t=temp%10;
		sum=sum+t;
		temp=temp/10;
	}
	
}
printf("\nsum=%d",sum);


}
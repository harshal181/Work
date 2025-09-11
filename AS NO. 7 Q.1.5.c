//1. Do all type 3 (with parameter, w/o return type) function programs using pointer.
//Strong number;

#include<stdio.h>
void strong(int *);
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	strong(&n);
}
void strong(int *a){
	//int *a=&n;
	for(int i=1;i<=*a;i++){
		int temp=i;
		int sum=0;
		while(temp>0){
			int b=temp%10;
			int c=1;
			for(int j=1;j<=b;j++){
				c=c*j;
			}
			sum=sum+c;
			temp=temp/10;
		}
		if(i==sum)
		printf("%d ",i);

}
}

//5 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong

#include<stdio.h>
void main(){
int n;
printf("Enter n=");
scanf("%d",&n);
int a,sum=0;
while(n>0){
	a=n%10;
	sum=sum+a*a*a;
	n=n/10;
	
}
if(n=sum){
	printf("Armstrong");
}
else{
	printf("not armstrong");
}


}
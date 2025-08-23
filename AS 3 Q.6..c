//6 Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

#include<stdio.h>
void main(){
int n;
printf("Enter n=");
scanf("%d",&n);


int a=1;
int sum=0;

while(a<n){
	if(n%a==0){
		sum=sum+a;
	
	}
	a++;
	

}
if(a=sum){
	printf("perfect");
}
else{
	printf("not prime");
}
}

    

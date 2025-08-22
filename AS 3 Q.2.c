//2 Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>
void main(){
int n;
printf("Enter the number:");
scanf("%d",&n);
int a=1;
while(a<=10){
	printf("%d ", n*a);
	a++;
	
}

}
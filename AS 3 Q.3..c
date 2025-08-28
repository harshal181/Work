//3 Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

#include<stdio.h>
void main(){

int a;
printf("start:");
scanf("%d",&a);

fflush(stdin);

int b;
printf("end:");
scanf("%d",&b);
int sum=0;

while(a<=b){
	sum=sum+a;
	a++;
	
}
printf("%d",sum);

}
}



}

//2. Create a structure Time with data members as hrs, min, sec. Accept the values of all
//these members from user and display them. Also perform addition of two time variables
//and display the result. If sec goes beyond 60, carry it to min etc. Add a method to convert
//the given time into sec.

#include<stdio.h>
struct time{
	int hours;
	int min;
	int sec;
};
int toSeconds(struct time t) {
    return t.hours * 3600 + t.min * 60 + t.sec;
}

void main(){
	struct time t1,t2,sum;
	int carry;

	printf("Enter the hours=");
	scanf("%d",&t1.hours);
	printf("\nEnter the minutes=");
	scanf("%d",&t1.min);
	printf("\nEnter the seconds=");
	scanf("%d",&t1.sec);
		
	printf("\n%d:%d:%d",t1.hours,t1.min,t1.sec);
	
	printf("\nEnter the hours=");
	scanf("%d",&t2.hours);
	printf("\nEnter the minutes=");
	scanf("%d",&t2.min);
	printf("\nEnter the seconds=");
	scanf("%d",&t2.sec);
	
	printf("\n%d:%d:%d",t2.hours,t2.min,t2.sec);
	
sum.sec=t1.sec+t2.sec;
carry=sum.sec/60;
sum.sec=sum.sec%60;

sum.min=t1.min+t2.min+carry;
carry=sum.min/60;
sum.min=sum.min%60;

sum.hours=t1.hours+t2.hours+carry;

 printf("\nTime 1 in seconds: %d", toSeconds(t1));
    printf("\nTime 2 in seconds: %d", toSeconds(t2));
    printf("\nSum in seconds: %d\n", toSeconds(sum));	
}
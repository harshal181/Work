//5. Write a menu driven program to take a number for user and perform operations as follows.

//Press 1.To check number is even or odd.
//press 2.To check number is prime or not.
//press 3.To check number is pallindrome or not.
//press 4.To check number is positive, negative or zero.
//press 5.To reverse a number.
//press 6.To find sum of digits.

#include<stdio.h>
void main(){
int exit;
do{
	int choice;
	printf("Press 1.To check number is even or odd.");
	printf("Press 2.To check number is prime or not.");
	printf("press 3.To check number is pallindrome or not.");
	printf("Press 4.To check number is positive, negative or zero.");
    printf("press 5.To reverse a number.");
    printf("press 6.To find sum of digits.");
    
    
    printf("Enter you choice:");
    scanf("%d",&choice);
    
    
    int n;
    printf("Enter the n:");
    scanf("%d",&n);
    
    if(choice==1){  // even or odd
    	if(n%2==0){
    		printf("Even");
		}
		else{
			printf("Odd");
		}
	}
	else if(choice==2){  //prime or not
		int flag=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=1;
			}}
			if(flag==0){
				printf("prime");
			}
			else{
				printf("not prime");
		}
		
	}
	else if(choice==3){  //palindrome or not
	 int a=n%10;
	 int b=n/10;
	 int rev=a*10+b;
	 
	 if(n==rev){
	 	printf("palindrome");
	 }
	 else{
	 	printf("not palindrome");
	 }
	 
	}
	else if(choice==4){  //number is positive,negative ,zero
		if(n>0){
			printf("number is positive");
		}
		else if(n==0){
			printf("number is zero");
		}
		else{
			printf("number is negative");
		}
	}
	else if(choice==5){  //reverse a number
	int a=n%10;
	int b=n/10;
	
	int rev=a*10+b;
	printf("%d",rev);
		
	}
	else if(choice==6){  //to find sum of digit
	  int temp=n;
	  int sum=0;
	  while(temp>0){
	  int a=temp%10;
	  sum=sum+a;
	  temp=temp/10;
	  
   }
   printf("%d",sum);     
	 
	
	}
	
    fflush(stdin);
    printf("\n do you want to continue:");
    scanf("%d",&exit);
}while(exit==1);

}
//3. Convert Ass_4 into two type of function i.e. w/o parameter, w/o return type and with parameter and w/o return type.

//4. Print strong numbers in the given range 1 to n.

#include<stdio.h>
void strong1();
void strong2(int);
void main(){
	
	printf("without parameter & without return type");
	strong1();
	printf("\nwith parameter & without return type");
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	strong2(n);
}
void strong1(){

	int n;
	printf("Enter the n:");
	scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
    	int temp=i;
    	int sum=0;
    	while(temp>0){
    		int b=temp%10;
    		int a=1;
    		for(int i=1;i<=b;i++){
    			a=a*i;
			}
			sum=sum+a;
			temp=temp/10;
		}
		if(i==sum)
		printf("%d ",i);
	}
	}
	
	
void strong2(int n){
for(int i=1;i<=n;i++){
    	int temp=i;
    	int sum=0;
    	while(temp>0){
    		int b=temp%10;
    		int a=1;
    		for(int i=1;i<=b;i++){
    			a=a*i;
			}
			sum=sum+a;
			temp=temp/10;
		}
		if(i==sum)
		printf("%d ",i);
	}
	
}
	
	
	
	


//10. Print a hollow square with diagonal pattern
//Input: n = 5
//Output:

//* * * * *
//* *     *
//*   *   *
//*     * *
//* * * * *


#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||i==n||i==j||j==n||j==1|j==n){
				printf("* ");
			}
			else{
				printf("  ");
			}
			
		}
		printf("\n");
	}
}
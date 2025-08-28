//2. Print prime numbers in the given range 1 to n.

#include<stdio.h>
void main(){
 int n;
 printf("Enter the n:");
 scanf("%d",&n);
 
 int flag=0;
 int i,j;
 for(i=2;i<n;i++){
 	flag=0;
 	for(j=2;j<i;j++){
 		if(i%j==0){
 			flag=1;
 			break;
		 }
	 }
	 if(flag==0){
	 	printf("%d ",i);
	 }
 }
}
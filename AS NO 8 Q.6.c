//6. Accept array and print only prime numbers of array.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	printf("Display the elements:");
	for(int i=0;i<10;i++){
		printf("%d ",a[i]);
	}
	printf("\nprime numbers:");
	
	int flag;
for(int i=0;i<10;i++){
	flag=0;
  if(a[i]<=1)
  flag=1;
  else{
  	for(int j=2;j<a[i];j++){
  		if(a[i]%j==0){
  			flag=1;
  			break;
		  }
	  }
  }
  if(flag==0)
  printf("%d ",a[i]);
  
}}
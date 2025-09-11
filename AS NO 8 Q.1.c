//1. Find minimum and maximum number in array.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	//Display the array;
  printf("Display the array:");
  for(int i=0;i<10;i++){
  	printf("%d ",a[i]);
	}
	
	//find minimum number in  array;
	printf("\n");
	
  int min=a[0];
  for(int i=1;i<10;i++){
  	if(min>a[i]){
  		min=a[i];
	  }
    }
    printf("minimum number in the array= %d ",min);
    
    
    //find maximum number in array;
    printf("\n");
    int max=a[0];
    for(int i=1;i<10;i++){
    	if(max<a[i]){
    		max=a[i];
		}
	}
    
  printf("maximum number in the array= %d",max);
}
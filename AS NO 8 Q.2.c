//2. Search the given number in array.

#include<stdio.h>
void main(){
  int a[10];
  printf("Enter the array:");
  for(int i=0;i<10;i++){
  	scanf("%d",&a[i]);
  }
  printf("Display the array:");
  for(int i=0;i<10;i++){
  	printf("%d ",a[i]);
  }
  
  printf("\n");
  
  int n;
  printf("Enter the n:");
  scanf("%d",&n);
  
  int index=-1;
  
  for(int i=0;i<10;i++){
  	if(a[i]==n){
  		index=i;
	  }
  }
  if(index==-1)
  printf("not found");
	
  else
  printf("value found at %d index",index);
}
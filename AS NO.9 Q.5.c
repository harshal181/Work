//5. Print alternate elements in array.

#include<stdio.h>
void alternate(int a,int* crr);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int crr[a];
	printf("Enter the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&crr[i]);
	}
	
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",crr[i]);
	}
	alternate( a,crr);
}

void alternate(int a,int* crr){
	printf("\nalternete numbers:");
	for(int i=0;i<a;i=i+2){
		printf("%d ",crr[i]);
	}
	
	
}
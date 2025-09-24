//Passing array to function
// Do all the questions of ASS_7 using function.

//1. Find minimum and maximum number in array.

#include<stdio.h>
void myarray(int a,int arr[]);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	printf("Enter the array:");
	int arr[a];
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
	}
	myarray(a,arr);
}
void myarray(int a,int arr[]){

int max;
int min;
for(int i=0;i<a;i++){
	max=arr[0];
	if(max<arr[i]){
		max=arr[i];
	}
}	


for(int i=0;i<a;i++){
	min=arr[0];
	if(min>arr[i]){
		min=arr[i];
}	}
	printf("\nminimum val= %d",min);
	printf("\nmaximum val= %d",max);

}
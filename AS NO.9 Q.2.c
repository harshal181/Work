//2. Search the given number in array.

#include<stdio.h>
int search(int a,int arr[],int b);
void main(){
 int a;
 printf("Enter the a:");
 scanf("%d",&a);
 
int arr[a];
for(int i=0;i<a;i++){
	scanf("%d",&arr[i]);
}
for(int i=0;i<a;i++){
	printf("%d ",arr[i]);
}

int b;
printf("\nEnter the b:");
scanf("%d",&b);
int res=search(a,arr,b);
if(res==-1)
printf("\nnot found");
else
printf("\nfound the %d at %d position",b,res);
	
}
int search(int a,int arr[],int b){
	int pos=-1;

	
	for(int i=0;i<a;i++){
		if(arr[i]==b){
			pos=i;
			break;
			
		}
	
}
	if(pos==-1)
	return -1;
	else
	return pos;
	
}

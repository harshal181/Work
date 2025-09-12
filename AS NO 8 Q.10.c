//10. Sort the array.


#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	printf("\nDisplay the array");
	
	for(int j=0;j<10;j++){
		printf("%d ",a[j]);
	}
	
	printf("\nAscending order:");
	int temp;
	for(int k=0;k<10;k++){
		for(int l=k+1;l<10;l++){
			if(a[k]>a[l]){
				temp=a[k];
				a[k]=a[l];
				a[l]=temp;
			}
		}
	}
	for(int u=0;u<10;u++){
		printf("%d ",a[u]);
	}
	
	printf("\nDescending order:");
	int stor;
	for(int y=0;y<10;y++){
		for(int w=y+1;w<10;w++){
			if(a[y]<a[w]){
				stor=a[y];
				a[y]=a[w];
				a[w]=stor;
			
		}
	}
	}
	for(int b=0;b<10;b++){
		printf("%d ",a[b]);
	}
}

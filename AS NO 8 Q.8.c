//8. Merge two arrays

#include<stdio.h>
void main(){
	int a[3];
	printf("Enter the first array:");
	for(int i=0;i<3;i++){
		scanf("%d",&a[i]);
	}
	printf("Display the first array:");
	for(int i=0;i<3;i++){
		printf("%d ",a[i]);
	}
	
	printf("\n");
	int b[4];
	printf("Enter the second array:");
	for(int i=0;i<4;i++){
		scanf("%d",&b[i]);
	}
	printf("Display the second array:");
	for(int i=0;i<4;i++){
		printf("%d ",b[i]);
	}
	printf("\n");
    
    int c[3+4];
    for(int i=0;i<3;i++){
    	c[i]=a[i];
	}
	for(int i=0;i<4;i++){
		c[3+i]=b[i];
	}
	printf("\nmerge two arrays:");
	for(int i=0;i<7;i++){
		printf("%d ",c[i]);
	}

}
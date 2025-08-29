//4. pyramid pattern
//Input: n = 5
//Output:
//*
//**
//***
//****
//*****

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			printf("*");
		}
		printf("\n");
	}
}
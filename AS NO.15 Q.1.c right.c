//1. Create a structure Book with data members as bname, id, author, price. Accept the values of all these members from user and display them.

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct book{
	int id;
	char bname[50];
	char author[50];
	float price;
};

void main(){
	
	struct book* b1;
	int a;
	printf("Enter the book:");
    scanf("%d",&a);
	
	b1=(struct book*)malloc (a*sizeof(struct book));
	
	for(int i=0;i<a;i++){
		printf("book id=");
		scanf("%d",&b1[i].id);
		getchar();
		printf("book name=");
		scanf("%[^\n]",b1[i].bname);
		getchar();
		printf("\nauthor name=");
		scanf("%[^\n]",b1[i].author);
		getchar();
		printf("\nprice=");
		scanf("%f",&b1[i].price);
	}
	
	for(int i=0;i<a;i++){
			printf("\nbook id=%d",b1[i].id);
			printf("\nbook name=%s",b1[i].bname);
			printf("\nauthor name=%s",b1[i].author);
			printf("\nbook price=%f",b1[i].price);
			
	}
}
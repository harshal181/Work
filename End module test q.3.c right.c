#include<stdio.h>
#include<stdlib.h>
struct mobile{
	 int mid ;
	char mname[20];
	float price;
	char brand[20];
};
static int total=0;
struct mobile* b1;
void addbook();
void displaybook();


void main(){
	int exit;

	do{
	int choice;
	printf("\npress 1.Add Mobile:");
	printf("\npress 2.Display Mobile Data:");
	printf("\nEnter the choice:");
	scanf("%d",&choice);
	getchar();
	if(choice==1)
	addbook();
	else if(choice==2)
	displaybook();
	else
         printf("Invalid choice!\n");

	printf("do you want to continue:yes-1,no-0:");
	scanf("%d",&exit);
}
while(exit==1);
}

void addbook(){
	int a;
	printf("\nEnter the number of the Mobile:");
	scanf("%d",&a);
 b1 = realloc(b1, (total + a) * sizeof(struct mobile));
	
	if(b1==NULL){
		printf("memory allocation fail");
		
	}
	else{
	
 
		for(int i=total;i<total+a;i++){
			printf("\nmobile id:");
			scanf("%d",&b1[i].mid);
			getchar();
			printf("mobile name:");
			scanf("%[^\n]",b1[i].mname);
			getchar();
			printf("\nmobile price:");
			scanf("%f",&b1[i].price);
			getchar();
			printf("\nmobile brand:");
			scanf("%[^\n]",b1[i].brand);
			getchar();
			
}
total=total+a;
}
}

void displaybook(){
	for(int i=0;i<total;i++){
		printf("\nmobile id=%d",b1[i].mid);
		printf("\nmobile name=%s",b1[i].mname);
		printf("\n mobile price=%f",b1[i].price);
		printf("\nmobile brand=%s",b1[i].brand);
	}
	
}

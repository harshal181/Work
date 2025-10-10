//4. Point of Sale System: Build a simple point of sale system using structures to represent products with attributes like name, price, and quantity.
//Allow users to add items to a cart and calculate the total cost.

#include<stdio.h>
struct product{
	char name[30];
	float price;
	int quantity;
};

void main(){
	float total_cost=0;
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	getchar();
	struct product p1[n];
	
	for(int i=0;i<n;i++){
		printf("\nProduct name=");
		scanf("%[^\n]",p1[i].name);
		getchar();
		printf("\nProduct price=");
		scanf("%f",&p1[i].price);
		getchar();
		printf("\nProduct Quantity=");
		scanf("%d",&p1[i].quantity);
		getchar();
	}
	
	printf("\nDisplat the product deatails\n");
	
	for(int i=0;i<n;i++){
		printf("productname=%s ,product price= %f ,product quantity=%d ",p1[i].name,p1[i].price,p1[i].quantity);
	}

	for(int i=0;i<n;i++)
{
    total_cost=total_cost+p1[i].quantity* p1[i].price;
	}	
	
	printf("\ntotal price=%.2f",total_cost);
}
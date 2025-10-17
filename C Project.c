#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct book{
	int book_id;
	char book_name[50];
	char author_name[50];
	char category[50];
	float price;
	float rating;
}; 
static int total=0;
struct book* b1=NULL;
void add_default_books();
void addbook();
void searchbook();
void search_book_id();
void search_book_name();
void removebook();
void showauthorbook();
void showcategorybook();
void updatebook();
void sortedbookdata();
void price_asc();
void price_desc();
void rating_asc();
void rating_desc();
void displaybook();
static int total;
void add_default_books() {
    total = 5; 
    b1 = (struct book*)malloc(total * sizeof(struct book));

    b1[0].book_id = 101;
    strcpy(b1[0].book_name, "C Programming");
    strcpy(b1[0].author_name, "Dennis Ritchie");
    strcpy(b1[0].category, "Programming");
    b1[0].price = 299.99;
    b1[0].rating = 4.8;

    b1[1].book_id = 102;
    strcpy(b1[1].book_name, "Java Basics");
    strcpy(b1[1].author_name, "James Gosling");
    strcpy(b1[1].category, "Programming");
    b1[1].price = 399.50;
    b1[1].rating = 4.5;

    b1[2].book_id = 103;
    strcpy(b1[2].book_name, "Data Structures");
    strcpy(b1[2].author_name, "Mark Allen");
    strcpy(b1[2].category, "Computer Science");
    b1[2].price = 450.00;
    b1[2].rating = 4.7;

    b1[3].book_id = 104;
    strcpy(b1[3].book_name, "Python Guide");
    strcpy(b1[3].author_name, "Guido van Rossum");
    strcpy(b1[3].category, "Programming");
    b1[3].price = 350.00;
    b1[3].rating = 4.6;

    b1[4].book_id = 105;
    strcpy(b1[4].book_name, "Algorithms");
    strcpy(b1[4].author_name, "CLRS");
    strcpy(b1[4].category, "Computer Science");
    b1[4].price = 500.00;
    b1[4].rating = 4.9;
}




void main(){
  add_default_books();
printf("\n============================================");
printf("\n  Dynamic Book Management System in C  ");
printf("\n============================================\n");

	
int exit;
do{
	  int choice;
printf("\n============== MENU ==============\n");
printf("Press 1.Add Book\n");
printf("Press 2.Search Book\n");
printf("Press 3.Remove Book\n");
printf("Prees 4.Show Author Book\n");
printf("Press 5.Show Category Book\n");
printf("Press 6.Update Book Details\n");
printf("Press 7.Sort Book Data\n");
printf("Press 8.Display All Books\n");
printf("=================================\n");

   
   

  printf("\nEnter your choice:");
  scanf("%d",&choice);
  
  if(choice==1)
  addbook();

  if(choice==2)
  searchbook();
  if(choice==3)
  removebook();
  if(choice==4)
  showauthorbook();
  if(choice==5)
  showcategorybook();
  if(choice==6)
  updatebook();
  if(choice==7)
  sortedbookdata();
  if(choice==8)
  displaybook();
printf("\ndo you want to continue..press1:-yes,press0:-no:");
scanf("%d",&exit);
}
while(exit==1);
printf("\n============================================");
printf("\nThank you for using Book Management System!");
printf("\n============================================\n");
}



void addbook(){
	
	int b;
	printf("Enter the number  books:");
	scanf("%d",&b);
	 b1 = (struct book*) realloc(b1, (total + b) * sizeof(struct book));
	if(b1==NULL){
		printf("memore allocation failed");
		return;
	}
  

  
else{

    for(int i=total;i<total+b;i++){
    	printf("Book id=");
    	scanf("%d",&b1[i].book_id);
    	printf("\nBook name=");
    	scanf(" %[^\n]",b1[i].book_name);
    	printf("\nAuthor name=");
    	scanf(" %[^\n]",b1[i].author_name); 
    	printf("\nCategory=");
    	scanf(" %[^\n]",b1[i].category);
    	printf("\nPrice=");
    	scanf("%f",&b1[i].price);
    
    	printf("\nRating=");
    	scanf("%f",&b1[i].rating);
	}
	total=total+b;

}
}




void searchbook(){
	int check;
	do{
		int option;
		printf("\npress 7.to search book id");
		printf("\npress 8.to search book name");
		fflush(stdin);
		printf("\nEnter the option");
		scanf("%d",&option);
		getchar();
		if(option==7)
	 search_book_id();
	 if(option==8)
	 search_book_name();
	
printf("\ndo you 1want to continue..press1:-yes,press0:-no:");
scanf("%d",&check);	
}

while(check==1);
}
	



void search_book_id(){
	int id;
	printf("Enter your search id:");
	scanf("%d",&id);
	int pos=-1;
for(int i=0;i<total;i++){
	if(b1[i].book_id==id){
		pos=i;
		break;
	}
}
	if(pos==-1)
	printf("\nnot found");
	else
	printf("\nbook id found at %d index",pos);
}

void search_book_name(){
	  char search[50];
    printf("\nEnter your search: ");
    scanf(" %[^\n]",search);
	getchar();
	int pos=-1;
	for(int i=0;i<total;i++){
		if(strcmp(b1[i].book_name,search)==0){
			pos=i;
			break;
		}
		}
	
if(pos==-1)
printf("\nnot found");
else
	printf("\nbook name found at  %d",pos);
}

void removebook(){
	int id;
	printf("Enter the removing book id:");
	scanf("%d",&id);
	int pos=-1;
	for(int i=0;i<total;i++){
	if(b1[i].book_id==id){

		pos=i;
		break;
	}
}
	

	if(pos==-1){
		printf("not found");
		return;
	}
	else{
	
	for(int i=pos;i<total;i++){
		b1[i]=b1[i+1];
	 printf("\nremove the book successfully");
	}
	

	}

	
total--;
}

void showauthorbook(){
	char check[50];
	printf("\nEnter the author name:");
	scanf(" %[^\n]",check);
	getchar();
	
	int found=0;
	for(int i=0;i<total;i++){
		if(strcmp(b1[i].author_name,check)==0){
			printf("book id=%d,book name=%s,book category=%s,price=%f,rating=%f\n",b1[i].book_id,b1[i].book_name,b1[i].category,b1[i].price,b1[i].rating);
			found=1;
		}
	}
	if(found==0){
	printf("not found");
	return;
}
}

void showcategorybook(){
	char search[50];
	printf("\nEnter the category of book:");
	scanf(" %[^\n]",search);
	getchar();
	int found=0;
	for(int i=0;i<total;i++){
		if(strcmp(b1[i].category,search)==0){
		
		printf("book id=%d,book name=%s,author name=%s,price=%f,rating=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].price,b1[i].rating);
		found=1;
	}
		
		}
		
	if(found==0){
			printf("not found");
			return ;
		}	
	}

void updatebook(){
	int id;
	int flag=0;
	printf("Enter the id do you want to search:");
	scanf("%d",&id);
	for(int i=0;i<total;i++){
		if(b1[i].book_id==id){
			printf("\nold price=%f",b1[i].price);
			printf("\nold rating=%f",b1[i].rating);
			
			printf("\nEnter the new price:");
			scanf("%f",&b1[i].price);
			printf("Enter new rating:");
			scanf("%f",&b1[i].rating);
			printf("\ndata update successfully");
			flag=1;
		}
	}
	if(flag==0){
		printf("not found");
		return;
	}
}

void sortedbookdata(){
	int exit;
	do{
		int check;
		printf("\npress1.sort the dats ascending order of the book price");
		printf("\npress2.sort the data descending order of the book price");
		printf("\npress3.sort the data in ascending order based on the book rating");
		printf("\npress4.sort the data in descending order based on the book rating");
		printf("\nEnter the check:");
		scanf("%d",&check);
		getchar();
		if(check==1)
		price_asc();
	
		
		if(check==2)
		price_desc();
	  
	   if(check==3)
	   rating_asc();
	   if(check==4)
	   rating_desc();
	   printf("\ndo you want to continue..press1:-yes,press0:-no:");
		scanf("%d",&exit);
	}while(exit==1);
}
	


void price_asc(){

	for(int i=0;i<total;i++){
		for(int j=i+1;j<total;j++){
			if(b1[i].price>b1[j].price){
				struct book temp=b1[i];
				b1[i]=b1[j];
				b1[j]=temp;
				
			}
			
		}
	}
	for(int i=0;i<total;i++){
		if(b1[i].book_id!=0)
		printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,,rate=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
}
int exit;
do{

printf("\nPrees1.top 3 books:");
int choice;
printf("\nEnter the choice:");
scanf("%d",&choice);

if(choice==1){

for(int i=0;i<3;i++){
	if(b1[i].book_id!=0)
	printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,,rate=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
}
}
printf("\ndo you want to continue..press1:-yes,press0:-no:");
scanf("%d",&exit);
}
while(exit==1);

}
void price_desc(){
		for(int i=0;i<total;i++){
		for(int j=i+1;j<total;j++){
			if(b1[i].price<b1[j].price){
				struct book temp=b1[i];
				b1[i]=b1[j];
				b1[j]=temp;
				
			}
			
		}
	}
	

	for(int i=0;i<total;i++){
		if(b1[i].book_id!=0)
		printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,rating=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
}

int exit;
do{

printf("\nPrees 2.top 3 books:");
int choice;
printf("\nEnter the choice:");
scanf("%d",&choice);
if(choice==2){


for(int i=0;i<3;i++){
	if(b1[i].book_id!=0)
	printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,,rate=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
}
}
printf("\ndo you want to continue..press1:-yes,press0:-no:");
scanf("%d",&exit);
}
while(exit==1);
}

void rating_asc(){
	for(int i=0;i<total;i++){
		for(int j=i+1;j<total;j++){
			if(b1[i].rating>b1[j].rating){
			struct book store=b1[i];
			b1[i]=b1[j];
			b1[j]=store;
		}
	}
}


	for(int i=0;i<total;i++){
		if(b1[i].book_id!=0)
			printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,rating=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
	}

	int exit;
do{

printf("\nPress 3.top 3 books:");
int choice;
printf("\nEnter the choice:");
scanf("%d",&choice);
if(choice==3){

	for(int i=0;i<3;i++){
		if(b1[i].book_id!=0)
	printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,,rate=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
}
}
printf("\ndo you want to continue..press1:-yes,press0:-no:");
scanf("%d",&exit);

}
while(exit==1);
}

void rating_desc(){
	for(int i=0;i<total;i++){
		for(int j=i+1;j<total;j++){
			if(b1[i].rating<b1[j].rating){
			struct book store=b1[i];
			b1[i]=b1[j];
			b1[j]=store;
		}
	}
}
	for(int i=0;i<total;i++){
		if(b1[i].book_id!=0)
			printf("book id=%d,book name=%s,author name=%s,category=%s,price=%f,rating=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
	
}
int exit;
do{

printf("\nPrees 4.top 3 books:");
int choice;
printf("\nEnter the choice:");
scanf("%d",&choice);
printf("\ntop 3 books:");
if(choice==4){

for(int i=0;i<3;i++){
	if(b1[i].book_id!=0)
	printf("\nbook id=%d,book name=%s,author name=%s,category=%s,price=%f,,rate=%f\n",b1[i].book_id,b1[i].book_name,b1[i].author_name,b1[i].category,b1[i].price,b1[i].rating);
	
}
}
printf("\ndo you want to continue..press1:-yes,press0:-no:");
scanf("%d",&exit);
}
while(exit==1);
}
void displaybook(){
		for(int i=0;i<total;i++){
		
		printf("\n===============================================");
        printf("\n Book ID     : %d", b1[i].book_id);
        printf("\n Book Name   : %s", b1[i].book_name);
        printf("\n Author Name : %s", b1[i].author_name);
        printf("\n Category    : %s", b1[i].category);
        printf("\n Price       : %f", b1[i].price);
        printf("\n Rating      : %f", b1[i].rating);
        printf("\n===============================================\n");

	}

}

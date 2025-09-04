//1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//6. Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void upperlower1();
void upperlower2(char);
char upperlower3();
char upperlower4(char);


void main(){
	printf("without parameter & without return type:");
	upperlower1();
	
	printf("\nwith parameter & without return type:");
	char abc;
	printf("Enter the ch:");
	scanf(" %c",&abc);
	upperlower2(abc);
	
	printf("\nwithout parameter & with return type:");
	char res=upperlower3();
	if(res=='a')
	printf("uppercase");
	else
	printf("lowercase");
	
	printf("\nwith parameter & woth return type:");
	char check;
	printf("Enter the char:");
	scanf(" %c",&check);
	char result=upperlower4(check);
	if(result=='t')
	printf("uppercase");
	else
	printf("lowercase");
}
void upperlower1(){
	char ch;
	printf("Enter the ch:");
	scanf(" %c",&ch);
	
if(ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||
ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
		printf("Uppercase");
	
	else
		printf("Lowercase");
	
}

void upperlower2(char ch){
	if(ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||
ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
		printf("Uppercase");
	
	else
		printf("Lowercase");
}
char upperlower3(){
	char ch;
	printf("Enter the ch:");
	scanf(" %c",&ch);
		if(ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||
ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
		return 'a';
	
	else
	  return 'b';
}
char upperlower4(char ch){
	
		if(ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||
ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
		return 't';
	
	else
	  return 'u';
}
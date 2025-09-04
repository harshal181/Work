//1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//4. Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
void vc1();
void vc2(char);
char vc3();
char vc4(char);
void main(){
		printf("Without parameter & without return type:");
		vc1();
		printf("\nwith parameter & without return type:");
		char ch;
		printf("Enter the ch:");
		scanf(" %c",&ch);
		 vc2(ch);
		
		printf("\nwithout parameter & with return type:");
		char abc=vc3();
		if(abc=='y')
		printf("vowel");
		else
		printf("consonant");
		
		printf("\nwith parameter & with return type:");
		char a;
		printf("Enter the a:");
		scanf(" %c", &a);
		char xyz=vc4(a);
		if(xyz=='t')
		printf("vowel");
		else
		printf("consonant");
}
void vc1(){
	char ch;
	printf("Enter the ch:");
	scanf(" %c",&ch);
	
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	printf("vowel");
	else
	printf("consonant");
}
void vc2(char ch){
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	printf("vowel");
	else
	printf("consonant");
}
char vc3(){
	char ch;
	printf("Enter the ch:");
	scanf(" %c",&ch);
	
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	return 'y';
	 else
	  return 'z';
}
char vc4(char ch){
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	return 't';
	 else
	  return 'u';
	
}
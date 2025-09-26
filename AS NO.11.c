//1. mystrcpy
//2. mystrlen
//3. mystrcmp
//4. mystrcat
//5. mystrncpy
//6. mystrupper
//7. mystrlower
//8. mystrrev
//9. mystrstr
//10. mystrcasecmp
//11. mystrchr
//12. mystrrchr
//13. mystrncmp
//14. mystrnstr
//15. mystrncat
//16. mystrncasecmp
#include<stdio.h>
#include<string.h>
void mystrcpy(char* ptr1,char* ptr2);
void mystrlen();
int mystrcmp(char* ptr1,char* ptr2);
void mystrcat(char*rtmnu1,char* rtmnu2);
void  mystrncpy(char* ac1,char* ac2);
void mystrrev(char* ac1);
void mystruper(char* aac);
void mystrlwr(char* abc);
void mystrchr(char* pqr, char xyz);
void mystrrchr(char* pqr, char xyz);
void main(){
	char abc1[]="This is a programming language";
	char abc2[sizeof(abc1)];
	mystrcpy(abc1,abc2);
	mystrlen(abc1);
	
	char pqr1[]="Amey";
	char pqr2[]="Amey";
  int pqrr=mystrcmp(pqr1,pqr2);
	if(pqrr==0)
	printf("\nsame");
	else
	printf("\nnot same");
	
	char rtmnu1[50]="This is c";
	char rtmnu2[]="But programming language";
	mystrcat(rtmnu1,rtmnu2);
	
	char ac1[]="abc";
	char ac2[sizeof ac1];
	 mystrncpy(ac1,ac2);
	
	char xyz[]="rtmnu";
	mystrrev(xyz);
	
	char amy1[]="This is cost of the product";
	mystruper(amy1);
	
	
	char rtt[]="This is world";
	char rt='i';
	mystrchr(rtt,rt);
	mystrrchr(rtt,rt);
	
	char ab[]="TIME IS MONEY";
	mystrlwr(ab);
 }
void mystrcpy(char* ptr1,char* ptr2){
    strcpy(ptr2,ptr1);
     printf("\nptr2= %s",ptr2);
}
void mystrlen(char *abc){
	int res=strlen(abc);
	printf("\n%d",res);
}
int mystrcmp(char* ptr1,char* ptr2){
	int result=strcmp(ptr1,ptr2);
	return result;
}

void mystrcat(char* rtmnu1,char* rtmnu2){
	strcat(rtmnu1,rtmnu2);
    printf("\nrtmnu1= %s",rtmnu1);
}

void  mystrncpy(char* ac1,char* ac2){
	strncpy(ac2,ac1,sizeof(ac1));
	printf("\nac2= %s",ac2);
	
	}
	

void mystrrev(char* rt){
	strrev(rt);
	printf("\nreverse of rt= %s",rt);
}

void mystruper(char* aac){
	strupr(aac);
	printf("\naac=%s",aac);
}

void mystrlwr(char* abc){
	strlwr(abc);
	printf("\nabc= %s",abc);
}
void mystrchr(char* pqr, char xyz){
   char* a=strchr(pqr,xyz);

 if(a!=NULL)
 printf("\nthe charater %c found at %id position",xyz,a-pqr+1);
 else
 printf("not found");
 }

void mystrrchr(char* at1,char at2){
	char* att=strrchr(at1,at2);
	if(att!=NULL)
	printf("\nthe character %c found at %id position",at2,att-at1+1);
	
}
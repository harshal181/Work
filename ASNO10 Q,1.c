//String built in function
//1. Use around 20 built-in functions of string in program.

#include<stdio.h>
#include<string.h>
void main(){
	//1 string built in function=strlen;
    char str1[]="This is a student";
    int res=strlen(str1);
    printf("length of String= %d",res);
    
    //2 string built in function=strcpy;
    
    char str2[]="Very good";
    char str3[sizeof(str2)];
    strcpy(str3,str2);
    printf("\nstr3[]= %s",str3);
    
    //3 string built in function=strncpy;
    
    char str4[]="Hello World";
    char str5[sizeof(str4)];
    
    strncpy(str5,str4,sizeof(str4)-1);
    str5[sizeof(str4)-1]='\0';
    printf("\nstr5= %s",str5);
    
    //4 string built in function=strcat;
    
    char str6[30]="Hello";
    char str7[]="Gemini";
    
   strcat(str6,str7);
   printf("\nstr6[]=%s",str6);
   
   //5 string built in function=strncat;
   
   char str8[30]="Hello";
   char str9[]="Gemini";
    strncat(str8,str9,2);
    printf("\nstr8[]= %s",str8);
    
    //6 string built in function=strcmp;
    
    char str10[]="Amey";
    char str11[]="Akshay";
    int stor=strcmp(str10,str11);
    printf("\nComparing of two Strings= %d",stor);
    
    //7 string built in function=strstr;
    
    char str12[]="This is a good boy";
    char str13[]="good";
    
    char *sto=strstr(str12,str13);
    
    if(sto!=NULL)
    printf("\nsubstring  found %s this is substring",sto);
	else
	printf("\nnot found");
	
	//8 string built in function=strspn() 
	char str14[]="Tutorials";
	int task=strspn(str14,"Tuto");
	printf("\n%d",task);
	
	//9.string built in function=strchr;
   char str15[]="C is a programming language";
   char ch='l';
   
   char* abc=strchr(str15,ch);
   
   if(abc!=NULL)
   printf("\nchar %c found at %d position",ch,abc-str15);
   else
   printf("not found");
   
   
   //10 string built in function=strcmp;
   
   char str16[]="Amey";
   char str17[]="Amey";
   
   int right=strcmp(str16,str17);
   
   printf("\n%d",right);
   
   //11 string built in function=strrchr;
   
   char str18[]="c is a easy language";
   char h='g';
   
   char* pqr=strrchr(str18,h);
   
   if(pqr!=NULL)
   printf("\nchar %c found at %d position",h,pqr-str18);
   else
   printf("\nnot found");
   
   //12 string built in function=memcpy;
   
   char abc1[]="C language";
   char pqr1[50];
   
   memcpy(pqr1,abc1,strlen(abc1)+1);
   
   printf("\nabc1=%s",abc1);
   printf("\npqr1= %s",pqr1);
   
   
   //13string built in function=memset; //
   char abc2[15];
   memset(abc2,'x',10);
   abc2[10]='\0';
   
   printf("\nabc2= %s",abc2);
   
   //14 string built in function=strcspn;
   char w[]="Techni";
   char s[]="cal";
   
   int cha=strcspn(w,s);
   printf("\nnumber of character before first match= %d",cha);
   
   //15 string built in function=memcmp;
   
   char q[]="abhishek";
   char t[]="AbhiShek";
   int st=memcmp(q,t,10);
   printf("\n%d",st);
   
   
   //16 string built in function=strlwr();
   
   char ok[]="ABC";
   strlwr(ok);
   printf("\nok =%s",ok);
   
   //17 string built in function=strupr();
  char stati[]="xyz";
  strupr(stati);
  printf("\nstati= %s",stati); 
  
  //18 string built in function=strpbrk
  
  char abc10[]="this is structure";
  char xyz10[]="yes";
  char* abbc=strpbrk(abc10,xyz10);
  if(abbc!=NULL)
  printf("\nfirst the %c matching at %d position",*abbc,abbc-abc10);
  else
  printf("not matching");
   
   
  //19 string built in function=strcoll;
  
  char abc12[]="chips";
  char abc13[]="snacks";
  int resu=strcoll(abc12,abc13);
  printf("\nstrcoll result= %d",resu);
  
  //20 string built in function=sprintf();
  
  char abc14[]="abcd";
  int num=200;
  sprintf(abc14,"%d",num);
  printf("abc14 = %s\n", abc14);
  



}
   
   
   
   
   
   
   
   
   
   
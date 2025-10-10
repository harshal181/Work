//3. Write a program to create an array for 10 players. For each player store name, no. of matches played, runs, wickets takes.
//a. Create function to Accept the information of each player.//
//b. Create function to display the information of all the players
//c. Display the information of player who made maximum runs and the one who took maximum number of wickets.

#include<stdio.h>
#include<stdlib.h>
struct player{
	char name[50];
	int matches_played;
	int runs;
	int wickets;
};

struct player* p1;
void accept(int a);
void display(int a);
void max(int a);
void maxruns(int a);
void maxwickets(int a);
void main(){
	int a;
printf("Enter the number of player:");
scanf("%d",&a);
getchar();
	p1=(struct player*)malloc (a*sizeof(struct player));
	int exit;
	do{
		int choice;
		printf("\npress1.Accept all details");
		printf("\npress2.display all details");
		printf("\npress3.show maximum run and wickets details");
		printf("\nEnter the choice:");
		scanf("%d",&choice);
		if(choice==1)
		accept(a);
		if(choice==2)
		display(a);
		if(choice==3)
		max(a);
		printf("do you want to continue..");
		scanf("%d",&exit);
	}while(exit==1);

}

void accept(int a){

	for(int i=0;i<a;i++){
		printf("player name=");
		scanf(" %[^\n]",p1[i].name);
	    getchar();
		printf("\nno.of matches played=");
		scanf("%d",&p1[i].matches_played);
		getchar();
		printf("\nruns=");
		scanf("%d",&p1[i].runs);
			getchar();
		printf("\nwickets=");
		scanf("%d",&p1[i].wickets);
	
}
}
void display(int a){
	for(int i=0;i<a;i++){
		printf("book name=%s",p1[i].name);
		printf("\nno of matches played=%d",p1[i].matches_played);
		printf("\nruns=%d",p1[i].runs);
		printf("\nwickets=%d",p1[i].wickets);
		
	}
}
void max(int a){
	int exit;
	do{
		int options;
		printf("press3.display the information of player those maximum runs");
		printf("\npress4.display the information of player those maximum wickets");
		printf("\nEnter the option:");
		scanf("%d",&options);
		
		if(options==3);
		maxruns(a);
		if(options==4);
		maxwickets(a);
		printf("\ndo you want to continue..");
		scanf("%d",&exit);
		
	}
	while(exit==0);
	}


void maxruns(int a){
	for(int i=0;i<a;i++){
		for(int j=i+1;j<a;j++){
			if(p1[i].runs<p1[j].runs){
				struct player pos1=p1[i];
				p1[i]=p1[j];
				p1[j]=pos1;
			}
		}
	}
		for(int i=0;i<1;i++){
			printf("\nplayer name=%s,no of matches played=%d,runs=%d,wickets=%d",p1[i].name,p1[i].matches_played,p1[i].runs,p1[i].wickets);
			break;
		}
	
}

void maxwickets(int a){
	for(int i=0;i<a;i++){
		for(int j=i+1;j<a;j++){
			if(p1[i].wickets<p1[j].wickets){
				struct player pos1=p1[i];
				p1[i]=p1[j];
				p1[j]=pos1;
			}
		}
	}
		 for(int i=0;i<1;i++){
		 
			printf("\nplayer name=%s,no of matches played=%d,runs=%d,wickets=%d",p1[i].name,p1[i].matches_played,p1[i].runs,p1[i].wickets);
	}
		
	
}
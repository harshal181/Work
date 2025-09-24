//10. Sort the array.
 
 #include<stdio.h>
 
void ascsort(int a,int arr[]);

 
 void main(){
 	int a;
 	printf("Enter the a:");
 	scanf("%d",&a);
 	
 	int arr[a];
 	
 	printf("Enter the elemnt in the array:");
 	for(int i=0;i<a;i++){
 		scanf("%d",&arr[i]);
	 }
	 
	 printf("\nDisplay the array:");
	 for(int i=0;i<a;i++){
	 	printf("%d ",arr[i]);
	 }
	 ascsort(a,arr);
 }
 void ascsort(int a,int arr[]){
 	int temp;
 	for(int i=0;i<a;i++){
 		for(int j=i+1;j<a;j++){
 			if(arr[i]>arr[j]){
 				temp=arr[i];
 				arr[i]=arr[j];
 				arr[j]=temp;
			 }
		 }
	 
}
printf("\n");

	 for(int i=0;i<a;i++){
	 	printf("%d ",arr[i]);
	 }
 	
 	
 }
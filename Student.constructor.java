class Student{
int rollno;
String name;
int marks;

void setrollno(int r){
this.rollno=r;
}
void setname(String n){
this.name=n;
}
void setmarks(int m){
this.marks=m;
}

int getrollno(){
return this.rollno;
}
String getname(){
return this.name;
}
int getmarks(){
return this.marks;
}
Student(){
this.rollno=12;
this.name="Amay mishra";
this.marks=800;
}
Student(int r,String n,int m){
this.rollno=r;
this.name=n;
this.marks=m;
}

void display(){
System.out.print("Student rollno = "+this.rollno);
System.out.print("\nStudent name = "+this.name);
System.out.println("\nStudent marks = "+this.marks);
}
}//class Student end here;

class TestStudent{
public static void main(String[]args){
Student s1=new Student();
Student s2=new Student(13,"Akshay wagh",875);
s1.display();
s2.display();
}//main ends here;
}//class TestStudent end 
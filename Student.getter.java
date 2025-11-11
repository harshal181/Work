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

void display(){
System.out.print("Student rollno = "+this.rollno);
System.out.print("\nStudent name = "+this.name);
System.out.println("\nStudent marks = "+this.marks);
}
}//class Student end here;

class TestStudent{
public static void main(String[]args){
Student s1=new Student();
Student s2=new Student();

s1.setrollno(103);
s1.setname("Abhishek Sharma");
s1.setmarks(489);

s2.setrollno(104);
s2.setname("Viral Mehta");
s2.setmarks(455);

s1.display();
s2.display();

if(s1.getmarks() > s2.getmarks())
    System.out.println("\n" + s1.getname() + " has higher marks than " + s2.getname());
else if(s1.getmarks() < s2.getmarks())
    System.out.println("\n" + s2.getname() + " has higher marks than " + s1.getname());
else
    System.out.println("\nBoth have equal marks.");
}//main end here
}//class TestStudent end 
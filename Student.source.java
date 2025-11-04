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
}//class Student end here;

class TestStudent{
public static void main(String[]args){
Student s1=new Student();
s1.setrollno(103);
s1.setname("abhishek sharma");
s1.setmarks(489);

System.out.print("student rollno="+s1.rollno);
System.out.print("\nStudent name="+s1.name);
System.out.print("\nStudent marks="+s1.marks);

}//main end here

}//class TestStudent end here;
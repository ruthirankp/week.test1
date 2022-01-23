package week.test1;

public class Student {
    static String name = "ruthiran";
	static int rollno =123456;

public void collegename()
{
System.out.println("govt college of tamilnadu");
}
public static void main(String[] args) {
	System.out.println(name);
	System.out.println(rollno);
	Student call=new Student();
	call.collegename();
		
}  
}
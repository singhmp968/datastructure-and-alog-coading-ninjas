//Acess modifiers 
//default means within the same package 
//public can be access anywhere and cann be used by any package
//private only within the same class directly we can


package classandobjects;
import java.util.Scanner;
public class Studentuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	Student s1=new Student("Ankush",121);//object creating 
	System.out.println(s1);//printing reference
//	System.out.println(s1.name);
//	System.out.println(s1.getRollno());
//s1.name="rahul";
//s1.rollno=21;
//s1.setRollno(-123);

	Student s2=new Student("sunny",123);//object creation

	System.out.println(s2);//printing referce
	System.out.println(s1.getnum());//giving same data by both s1 and s2//
	System.out.println(s2.getnum());
	System.out.println(Student.getnum());//much way to acess static keyword non static member cannot be accsed like this
	
	//	s2.name="sunny";
//	s2.setRollno(23);
//	System.out.println(s1.name);
//	System.out.println(s2.name);
//	System.out.println(s2.getRollno());
//	System.out.print(s1);// showing memory location
	//within the same package we don't have to write import
s1.print();
s2.print();
	
	}

}

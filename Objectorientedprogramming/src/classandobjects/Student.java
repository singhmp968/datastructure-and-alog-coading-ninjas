package classandobjects;

public class Student {
	private static int numstudent;
public String name;
//final data member can be initiize as soon as they are declare
private final int rollno;// by using final keyword we can initilize only once and cannot be re initilize again
//public Student() {
//	name=n;
//}
public static int getnum() {// also static function we can crear by placing static on it
	
	//ex-public static int gr=etnum(){}
	return numstudent;//inorder to acess numstudent and ir cannot be changed
}
public Student(String name,int rollno) {//here this means that it will be compulsory to return name and rollno and the constructor will set it 
	System.out.println(this);//it will print reference
	this.name=name;
	this.rollno=rollno;
	numstudent++;
}

//public void setRollno(int rn) {beacause of final keyword
//	if(rn<=0) 
//	
//	rollno=rn;// getting the value of rollno;
//	
//}
public int getRollno() {
	return rollno;//to return the value;
}

public void print() {
	System.out.println(name+" :"+rollno);
}
}

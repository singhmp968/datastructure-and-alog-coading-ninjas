package classandobjects;

public class Fractionuse {
	public static void temp() throws ZeroDenominatorException {
	
		// TODO Auto-generated method stub
fraction f1=new fraction(20,30);
	f1.print();
//2/3
f1.setdenominator(12);
//4/1
int d=f1.getdenominator();
System.out.println(d);
f1.print();

f1.setdenominator(30);
int i=10;// the statement has trapeed so output will be 0;
int j=47;
try {
j++;
	f1.setdenominator(0);
i++;	
}catch(ZeroDenominatorException e){
		System.out.println("hey don't put input as zero");
		
	}
System.out.println(i+" "+j);
	// 1/3
f1.print();
fraction f2=new fraction(3,4);
f1.add(f2);
f1.print();
//f1=>13/12
fraction f3=new fraction(4,5);
f3.multiply(f2);
f3.print();
//f3=>3/5
f2.print();
//f2=>3/4
fraction f4=fraction.add(f1,f3);
f1.print();
f3.print();
f4.print();
	
	}

	

public static void main(String[] args)  throws ZeroDenominatorException {

temp();
}}
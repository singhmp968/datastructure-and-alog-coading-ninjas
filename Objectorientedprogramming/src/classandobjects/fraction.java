package classandobjects;

public class fraction {
private int numerator;
private int denominator;
public fraction(int numerator,int denominator) {
	this.numerator=numerator;
	if(numerator==0) {
		//todo error
	}
	this.denominator=denominator;
	simplify();
}

public int getdenominator()  {
	return denominator;


}
public int getnumerator() {
	return numerator;
}
public void setnumerator(int n) {
	this.numerator=n;
	simplify();
}
public void setdenominator(int d) throws ZeroDenominatorException{
if(d==0) {// todo error out
	//return;
	ZeroDenominatorException e=new ZeroDenominatorException();
	throw e;


}
this.denominator=d;
this.simplify();
}
public void print() {
	if(denominator==1) {
System.out.println(numerator);
}
else {
	System.out.println(numerator+"/"+denominator);
	}
}


private void simplify() {
	int gcd=1;
	int small=Math.min(numerator,denominator);
	for(int i=2;i<small;i++) {
		if(numerator%i==0 && denominator%i==0) {
			gcd=i;
		}
	}
numerator=numerator/gcd;
denominator=denominator/gcd;

}



public static fraction add(fraction f1,fraction f2) {
	int newNum=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
	int newDen=f1.denominator*f2.denominator;
	fraction f=new fraction(newNum,newDen);
	return f;
}
public void add(fraction f2) {
	this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
	this.denominator=this.denominator*f2.denominator;
	simplify();
}
public void multiply(fraction f2) {
	this.numerator=this.numerator*f2.numerator;
	this.denominator=this.denominator*f2.denominator;
	simplify();
}
}

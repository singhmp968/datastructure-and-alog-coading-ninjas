package remp2;

public class complexnumber {
private int real;
private int img;
public complexnumber(int real,int img) {
this.real=real;
this.img=img;
	
}
public int gettimg() {
	return img;
}
public int getreal() {
	return real;

}
public void setreal(int real) {
this.real=real;	
}
public void setimg(int img) {
this.img=img;	
}

public void print() {
	System.out.println(real+"+i"+img);
}

public void add(complexnumber c2) {
	this.real=this.real+c2.real;
	this.img=this.img+c2.img;
	
}
public void multiply(complexnumber c2) {
	this.real=this.real*c2.real;
	this.img=this.img*c2.img;
	
}
//public complexnumber conjugate() {
//	
//}
//public static complexnumber add(complexnumber c1,complexnumber c3) {
//	
//}
}

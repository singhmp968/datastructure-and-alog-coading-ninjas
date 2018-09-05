package remp2;

public class complexnumuse {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			complexnumber c1 = new complexnumber(2, 3);
			c1.print();
			
			c1.setreal(10);
			c1.setimg(30);
			c1.print();
			
			complexnumber c2 = new complexnumber(1,5);
			c1.add(c2);
			c1.print();
			c2.print();
			
			complexnumber c3 = new complexnumber(3,2);
			c3.multiply(c2);
			c3.print();
			c2.print();
			
//			complexnumber c4 = complexnumber.add(c1, c3);
//			c1.print();
//			c3.print();
//			c4.print();
			
//			ComplexNumber c5 = c1.conjugate();
//			c5.print();
		}

	}



package generics2;

import generics.pair;

public class pairuse2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pairdiff<String, String> p=new pairdiff<String,String>("ab","cd");
		p.setFirst("def");
		String s=p.getFirst();
		//pair<int> p1=new pair<int>(1,2);//this is prrematative datatype so not allowed
		pairdiff<Integer,String> p1=new pairdiff<Integer,String>(1,"temp");
		pairdiff<Character,Character> p2=new pairdiff<>('a','b');
	
		int a=10;
		int b=12;
		int c=23;
		pairdiff<Integer,Integer> ip=new pairdiff<>(a,b);
		
		
	pairdiff<pairdiff<Integer,Integer>,Integer> p3=new pairdiff<>(ip,c);	
	
	System.out.println(p3.getSecond());
	System.out.println(p3.getFirst().getFirst());
	System.out.println(p3.getFirst().getFirst());
	}
}

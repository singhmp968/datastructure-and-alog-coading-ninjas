package generics;

public class pairuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pair<String> p=new pair<String>("ab","cd");
		p.setFirst("def");
		String s=p.getFirst();
		//pair<int> p1=new pair<int>(1,2);//this is prrematative datatype so not allowed
		pair<Integer> p1=new pair<Integer>(1,2);
		pair<Character> p2=new pair<>('a','b');
		
	}

}

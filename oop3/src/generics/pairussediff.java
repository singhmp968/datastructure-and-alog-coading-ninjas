package generics;

public class pairussediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pair<String, String> p=new pair<String,String>("ab","cd");
		p.setFirst("def");
		String s=p.getFirst();
		//pair<int> p1=new pair<int>(1,2);//this is prrematative datatype so not allowed
		pair<Integer,String> p1=new pair<Integer,String>(1,"temp");
		pair<Character> p2=new pair<>('a','b');
		
	}
	
}

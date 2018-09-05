package temp;


class box{
	
	int length;
	int breadth;
	int height;
	void vol() {
		System.out.println(length*breadth*height);
	}
	
}
public class boxuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
box b=new box();
b.height=5;
b.breadth=4;
b.vol();

	}

}

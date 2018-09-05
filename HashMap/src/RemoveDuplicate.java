import java.util.ArrayList;
import java.util.HashMap;
public class RemoveDuplicate {

	public static ArrayList<Integer> removeDuplication(int a[]){
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer,Boolean> seen=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(seen.containsKey(a[i]))//key
			{
				continue;
			}
		output.add(a[i]);
		seen.put(a[i],true);
		}
	return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,2,4,1,2,2,2,100000,3,2};
ArrayList<Integer> output=removeDuplication(a);
for(int i=0;i<output.size();i++) {
	System.out.println(output.get(i));
}
	}

}

import java.util.HashMap;
import java.util.Set;
public class MApUse_Inbuilt_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Insert
		HashMap<String,Integer> map=new HashMap<>();// declaring hashmap function
		
		map.put("abc" ,1);
		map.put("def" ,2);
		map.put("abc1" ,1);
		map.put("def1" ,2);
		// Check Presence like if
		System.out.println("size " + map.size());
		
		if(map.containsKey("abc"));
		{
			System.out.println( "Has abc");
		}
		if(map.containsKey("abc1") ){
			System.out.println("Has abc1");
		}
		if(map.containsValue(2)) {
			System.out.println("Has 2 as Value");
		}
		
		
	// get Vaue
	//	int v=map.get("abc1");
		//System.out.println(v);// print the  value
	//}
// other way to do 
		int v=0;
		if(map.containsKey("abc1")) {
			v=map.get("abc1");
		}
	System.out.println(v);

	// Remove
	int s=map.remove("abc");
	System.out.println(s);
	
	//iteretion 
	Set<String> keys=map.keySet();
	for(String str : keys) {// fast iteratino
		System.out.println(str);
	}
	}
}
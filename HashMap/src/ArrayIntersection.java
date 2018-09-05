import java.util.HashMap;

public class ArrayIntersection {
public static void intersection(int arr1[],int arr2[]) {
HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
for(int i=0;i<arr1.length;i++) {
	if(!map.containsKey(arr1[i])) {
		map.put(arr1[i], 1);
	}else {
		int count=map.get(arr1[i])+1;
	map.put(arr1[i],count);
	}
}

for(int i=0;i<arr2.length;i++) {
	if(map.containsKey(arr2[i])) {
		int val=map.get(arr2[i])+1;
	if(val>0) {
		System.out.println(arr2[i]);
		map.put(arr2[i], val-1);
	}
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int[] arr1= {2,6,8,5,4,3};
	int [] arr2= {2,3,4,7};
	intersection(arr1,arr2);
	}

}

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFrequencyNumber {
	public static int maxFrequencyNumber(int[] arr){
		int maxCount=0,count=0,freValue=-1;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
				for(int i=0;i<arr.length;i++) {
					if(map.containsKey(arr[i])) {
						count=map.get(i)+1;
						map.put(arr[i], count);
						if(count>maxCount) {
							maxCount=count;
							freValue=arr[i];
						}
					}
				}
				if(freValue == -1 && arr.length>0)
					return arr[0];
				return freValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[] = {2,12,2,11,12,2,12,2,11,12,6};
	int m=maxFrequencyNumber(a);
	System.out.println(m);
	}

}

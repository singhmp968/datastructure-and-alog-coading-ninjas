package linkedAssignment1;

public class Findindex {
	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}


	public class Solution {
		public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
		LinkedListNode<Integer> temp=head;
	      int i=0,c=0;
	      while(temp!=null){
	        if(temp.data==n){
	 return i;
	        }
	        i++;
	        temp=temp.next;
	      }
	      return -1;     
	      
	 
	      
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

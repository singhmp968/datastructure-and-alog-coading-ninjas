package LinkedList2;

public class MidPiontUsingLinkedList {

	class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.setData(data);
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

	}
	* */
	public class Solution {
		public static int printMiddel(LinkedListNode<Integer> head) {
	      LinkedListNode<Integer> fast=head.next;
	      LinkedListNode<Integer> slow=head;
	  
	    if(head==null){
	      return -1;
	    }
	      
	                  

	         
	      
	      while(fast!=null&&fast.next!=null){
	        fast=fast.next.next;
	        slow=slow.next;
	      
	      }
	      
	        
	        
	      
	    return slow.data;
	   
	    
	    
	    }
	  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

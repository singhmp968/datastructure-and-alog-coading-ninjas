import arraylist.Node;


	public class Node<T> {
		T data;
		Node<T> next;//it refer to only node where type =T;
		Node(T data){
			this.data=data;
			next=null;
		}
		}



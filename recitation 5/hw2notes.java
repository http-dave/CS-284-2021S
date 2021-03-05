import java.util.*;
public class IDLList<E>{
	//data fields
	private Node<E> head;
	private Node<E> tail;
	private int size;
	private ArrayList<Node<E>> indicies;

	public class Node<E>{
		//inner class data fields
		E data;
		Node<E> next;
		Node<E> prev;


		public Node(E elem){
			//set the data fields
			//this.(data field) = corresponding argument
			//since element is given prev and next are null

		}
		public Node(E elem, Node<E> prev, Node<E> next){
			//set the data fields
			//this.(data field) = corresponding argument
			//since element and prev and next are given set all values
		}

	}

	public IDLList(){
		//set data fields to default values
		//this.indicies = new ArrayList<Node<E>>();
	}


	public boolean add(int index, E elem){
		//check corner cases:
		//if index is 0, if size == 0 && index == 0
		//if size isnt zero 
		//if index == 0 insert node at the beginning 
		// create new node with values:
		// Node<E> node = new Node<E>(elem, null, this.indicies.get(index))
		// to index array list: this.indicies.get(index) -> will return Node<E>
		// to add node into array list this.indicies.add(index, node);
		//set the next nodes previous to node just inserted 
		//check if you inserted at the end index == this.size
		//add node at the end set the previous to node that was once the tail 
		//set next for node that was once the tail to the node you inserted
		// check if youre inserting inbetween 
		//insert node at index set current node next to node index
		//previous to index-1
		//DONT FORGET: to change prev of index +1 node to current change next of index-1 node to current
		//DONT FORGET: to set the data fields, set size, set head, set tail
		//return true
	}

	public boolean add(E elem){
		//if index is 0, if size == 0 && index == 0
		//if size isnt zero 
		//if index == 0 insert node at the beginning 
		// create new node with values:
		// Node<E> node = new Node<E>(elem, null, this.indicies.get(index))
		// to index array list: this.indicies.get(index) -> will return Node<E>
		//DONT FORGET: to set the data fields, set size, set head, set tail
		//return true
	}

	public boolean append(E elem){
		//check if you inserted at the end index == this.size
		//add node at the end set the previous to node that was once the tail 
		//set next for node that was once the tail to the node you inserted
		//DONT FORGET: to set the data fields, set size, set head, set tail
		//return true
	}

	public E get(int index){
		// can create a temp variable of type E;
		//if index is out of bounds throw exception 
		//if index was valid set temp equal to that node.data
		//return temp
	}

	public E getHead(){
		//check if head is null
		//if null, throw an exception
		//if not return head.data
	}

	public E getTail(){
		//check if tail is null
		//if it is throw exception
		//if not return tail.data
	}

	public E size(){
		//return this.size
	}

	public E remove(){
		//before removing node make its next and prev pointers null
		//make a temp of type E
		//check if size == 0 || or if head is null
		//throw exception
		//before removing node set temp = node.data
		//if size is 1 just remove node and set data fields accordingly
		//if it isnt
		//remove the node and dont forget to set the prev pointer of the node that came after
		//DONT FORGET: to set the data fields
		//return temp
	}

	public E removeLast(){
		//before removing node make its next and prev pointers null
		//make a temp of type E
		//check if size == 0 || or if tail is null
		//throw exception
		//before removing node set temp = node.data
		//if size is 1 just remove node and set data fields accordingly
		//if it isnt
		//remove the node and dont forget to set the next pointer of the node that came before
		//DONT FORGET: to set the data fields
		//return temp
	}

	public E removeAt(int index){
		//before removing node make its next and prev pointers null
		//make a temp of type E
		//check that index is in bounds if not 
		// throw new IllegalStateException();
		//check for size == 0 -> yhrow new IllegalStateException();
		//check if size == 1 && index == 0
		//remove node
		//if size == 1 && index != 0 throw exception
		//if size >= 2
		//check if trying to remove the first node -> similar process to remove()
		//check if trying to remove the last node => similar to removeLast()
		//check if trying to remove node in between 
		//set temp = node at index.data
		//remove node
		//set prev of index + 1 node to index -1 node
		//set next of index - 1 node to index + 1 node
		//Dont forget to set data fields
		//return temp
	}

	public boolean remove(E elem){
		// crate a temp node with value = head
		// traverse with head with a while head != null
		// if the head.data == elem
		// if it is equal then check if index == 0
		//if it is equal to last -> similar to removeLast()
		// if its inbeteen similar to removeAt()
		//dont forget to set data fields and set head to temp
	}

	public String toString(){
		//create a temp node = to head
		//traverse list and print head.data
		// set head to temp
		//return string
	}



}
//MyStackList.java
public MyStackList<Item>{
	private Node first = null;

	private class Node{
		Item item;
		Node next;
	}

	public MyStackList(){
		this.first = null;
	}
	//a->null
	public void push(Item item){
		//create a new node save it as a variable 
		//set fields of that node
		//set first to added node 
	}

	public Item pop(){
		//make temp to store return value
		//check if stack is empty, if so throw exception
		//grab value of first node 
		//set first = to next node
		//set temp next to null
		//return temp.item 
	}

	public isEmpty(){
		//if first is null then true else false

	}

	//you could write a main function to test if it works or not

}

//MyStackArray.java
public class MyStackArray<Item>{
	private Item[] s;
	private int N = 0;


	public MyStackArray(){
		this.s = (Item[]) new Object[2];
	}

	public boolean isEmpty(){
		//check if N = 0 if so, true else false
	}

	public void push(Item item){
		//if the array is full
		//then make a new array of size s.length*2
		//fill new array with elements from old array
		//set s equal to that new array
		//add element to the end of the array

	}

	public Item pop(){
		//if array is empty throw exception
		//else store latest element in a temp
		//then set that value in array to null
		//check if N > 0 and if N is equal to a 1/4 of s.length
		//make new array of size s.length/2
		//store values from original array into new array 
		//set s = to new array 
		//return item popped

	}

//ArithSolver.java
public class ArithSolver{
	MyStackArray<String> op_stack;
	MyStackList<Doubles> val_stack;

	public ArithSolver(){
		op_stack = new MyStackArray<String>();
		val_stack = new MyStackList<Double>();
	}

	public double algo(String exp){
		// you algorithm
		// you need to account for numbers with multiple digits or (22)
		// account for decimals (1.2) 
		// assume all inputs are valid
		// iterate through the exp string
		// check each character
		//if char is a operator +-*/
		// add it to op stack
		// if a ) pop val stack twice and op stack and do op on values
		// Note: v1 = stack.pop() v2 = stack.pop() v2 op v1 
		// (2/3) 
		// if ( do nothing 
		// if a value start a while loop
		//before loop starts make a string = ""
		//while charAt(i) is a value / digit or a decimal (.)
		// string += charAt(i)
		// increment i
		// if string is not empty, convert strinf to double and oush to val stack


		//pop stack returm value

	}




	public static void main(String[] args){
		ArithSolver a = new ArithSolver();
		System.out.println(a.solve("(2+3)"));

	}

}

}


// todays excerice 

//ring buffer -> queue but as an array

| |2|3|4|
^ ^     

//if i called pop?









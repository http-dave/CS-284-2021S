import java.util.*;

public class BinaryNumber{
	//data fields
	private int data[];
	private int length;


	public BinaryNumber(int length){
		// exception -> throw new (type of exception) IllegalArgumentException
		// int arr[] = new int[length]; -> automatically initializes arry with zeros
		// set object length to length given as parameter
	}

	public BinaryNumber(String str){
		// error if the string that you passed is "" -> handle with exception
		// initialize the onject data array with the size of the string
		// loop through the string and check if inputs are 1's and 0's
		//	set data[index] = string.charAt(index);
		// set the length of the binarynumber to the size of the string
	}

	//getter methods
	int getLength(){
		// return length -> this.length
	}

	int[] getInnerArray(){
		// return data array -> this.data array
	}

	int getDigit(int index){
		//if index is out of bounds, throw an error IndexOutOfBounds
		// try catch -> try indexing data array at index catch 
		try{
			//index array
		}catch(Exception e){
			//throw exception
		}
	}

	int toDecimal(){
		//converting the binary to a decimal number
		/*
		43210
		11101
		2^0 + 2^2 + 2^3 + 2^4 = 
		*/
		//iterate backwards -> for loop starting from length of data array - 1
		// i++ i = i+1, i--
		//power int increase the loop decreases 
		// you can interate forward but the power would be length of data array - 1
		//reverse the binary number in a new array, then iterate forward
		//return your sum
	}

	void bitShift(int direction, int amount){
		// if direction does not equal -1 or 1 thats an invalid argument
		// check if the amount is valid has to be > 0
		//if direction is -1 left shift, multiplication
		// create a new array with amount + the size of your current array
		//int arr[] = new int[data array size + amount]
		// iterate upto the size of your data array and place the values in the 
		// new array and leave the end as zeros
		// change the size of the object and set data array to new array

		//if direction is 1 right shift division
		//check if the amount that you wish to shift is greater than size
		//if so set size to 1 and data array to just one 0
		//if its not make an array with size of data array length - amount
		// iterate upto the size of the array - amount 
		//set values if new array with values of old new arr[i] old arr[i]
		//set your data fields, data array to new data array and the size
		//to the size of the new array
	}

	static int[] bwor(BinaryNumber bn1, BinaryNumber bn2){
		//check if both numbers are the same size
		//bn1.getLength() -> returns the length of the binary number
		// make a new array with the size of both 
		// iterate through both check if at same index either of the binary numbers are 1
		// if they are place a one in the new array
		// if they are not then place a zero in the new array
		// return that array
	}
	static int[] bwand(BinaryNumber bn1, BinaryNumber bn2){
		//check if both numbers are the same size
		//bn1.getLength() -> returns the length of the binary number
		// make a new array with the size of both 
		// iterate through both check if at same index both of the binary numbers are 1
		// bn1.getDigit(index)
		// if they are place a one in the new array
		// if they are not then place a zero in the new array
		// return that array
	}

	static void prepend(int amount){
		// make a new array with amount + size of the data array
		//iterate starting from amount
		//place old array values into new array
		//change the size to amount + the size of the old data arraty
		// change the data array to the new data array
	}

	void add(BinaryNumber aBinaryNumber){
		//check which is smaller and prepend it with the difference 
		//iterate backwards for both binary numbers
		// have a remander variable 
		//take the sum of the indexes and carry and modulo (%) 2
		// have a carry over value sum / 2
		// set your index in the new array as remainder
		// when done going through loop if carry is > 0 
		//make a new array size of old array + 1
		//place carry over value into the array 
		//set the data array to new final result from adding
		//set the size of the size of that data array
	}




}
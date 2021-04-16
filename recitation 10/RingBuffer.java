//Recitation excercise 
public class RingBuffer {
    private int first;            // index of first item in buffer
    private int last;             // index of last item in buffer
    private int size;             // current number of items of buffer
    private double[] buffer;

    // create an empty buffer, with given max capacity
    public RingBuffer(int capacity) {
        // YOUR CODE HERE
        this.buffer = new Double[capacity];
        this.first = 0;
        this.last = 0;
        this.size = 0;
    }

    // return number of items currently in the buffer
    public int getSize() {
        // YOUR CODE HERE
        return this.size;
    }

    // is the buffer empty (size equals zero)?
    public boolean isEmpty() {
        // YOUR CODE HERE
        return this.size == 0;
    }

    // is the buffer full (size equals array capacity)?
    public boolean isFull() {
        // YOUR CODE HERE
        return this.size == buffer.length;
    }

    // add item x to the end
    public void enqueue(double x) {
        if (isFull()) { throw new RuntimeException("Ring buffer overflow"); }
        // YOUR CODE HERE
        buffer[last] = x;
        if(last == buffer.length - 1){
            last = 0;
        }else{
            last++;
        }
        size++;
    }

    // delete and return item from the front
    public double dequeue() {
        if (isEmpty()) { throw new RuntimeException("Ring buffer underflow"); }
        // YOUR CODE HERE
        Double temp = buffer[first];
        buffer[first] = 0.0;
        if(first == buffer.length-1){
            first = 0;
        }else{
            first++;
        }
        size--;
        return temp;
    }

    // return (but do not delete) item from the front
    public double peek() {
        if (isEmpty()) { throw new RuntimeException("Ring buffer underflow"); }
        // YOUR CODE HERE
        return buffer[first];
    }

    // a simple test of the constructor and methods in RingBuffer
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        RingBuffer buffer = new RingBuffer(N);
        for (int i = 1; i <= N; i++) {
            buffer.enqueue(i);
        }
		double t = buffer.dequeue();
		buffer.enqueue(t);
		System.out.println("Size after wrap-around is " 
				   + buffer.getSize());
        while (buffer.getSize() >= 2) {
            double x = buffer.dequeue();
            double y = buffer.dequeue();
            buffer.enqueue(x + y);
        }
        System.out.println(buffer.peek());
    }
}




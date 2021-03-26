//stacks and queues
stack<int> s;
queue<int> q;
String str = "hello"
for(int i = 0; i < str.length(); i++){
	s.push(str.charAt(i));
}
while(!s.empty()){
	q.add(s.pop);
}
int elem = 0;
if(q.peek() == null){
	elem = -1;
}else{
	elem = q.poll();
}
while(elem != -1){
	if(q.peek() == null){
		elem = -1;
		break;
	}
	System.out.println(q.peek());
	elem = q.poll();
}
q.remove() - > does not return null if q is empty
q.poll() -> does return null if empty

// what is the return value
// olleh

// stack first in last out
// queue first in first out

//big o notation

for(int i = 0; i < n; i++){
	instruction1;
	instruction2;
	...
	instructon50;
}
// what is the runtime of this code?
n in the set of O(n)
 O(n)

 //ex2

for(int i = 0; i < n; i++){
	instruction1;
}
for(int i = 0; i < n; i++){
	instruction1;
	
}
// what is the run time here?
n+n = O(2n) in the set O(n)
2n <= n

//ex3
for(int i = 0; i < 2; i++){
	instruction1;
}
// O(2) in the set of O(1)
O(1) -> constant runtime
O(n) -> linear runtime
..

for(int i = 0; i < n; i++){
	for(int j = 0; i < n; i++){
		instruction1;
	}
}
// runtime is O(n^2)


3 nested loops  runtime is O(n^3)

//ex5
for(int i = 0; i < n; i*=i){
	instruction1;
}
//what is the runtime?
O(log(n))

//while loops same as for loops
int i = 0;
while(i < n){
	instruction1;
}
//runtime of O(n)






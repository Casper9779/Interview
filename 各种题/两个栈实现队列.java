package S;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class Main {
	
	static Stack<Integer> num = new Stack<>();
	static Stack<Integer> temp = new Stack<>();

	public void add(int n){
		num.push(n);
	}
	
	
	public int poll(){
		if (num.isEmpty()&&temp.isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		
		if(temp.isEmpty()){
			while(!num.isEmpty()){
			temp.push(num.pop());
			}
		}
		
		return temp.pop();
		
		
	}

	public int peek(){
		if (num.isEmpty()&&temp.isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		
		if(temp.isEmpty()){
			while(!num.isEmpty()){
			temp.push(num.pop());
			}
		}
		
		return temp.peek();
	}
	
	public static void main(String[] args) {
		Main m=new Main();
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(5);
		System.out.println(m.poll()+" "+m.poll()+" "+m.peek()+" "+m.peek());
		
	}
}

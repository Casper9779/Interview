
import java.util.Stack;

import javax.management.RuntimeErrorException;

public class Main {
	// 返回栈中最小元素
	static Stack<Integer> num = new Stack<>();
	static Stack<Integer> temp = new Stack<>();

	public void push(int n) {
		if (temp.isEmpty())
			temp.push(n);
		else if (n > temp.peek()) {
			temp.push(temp.peek());
		}else if(n<temp.peek()){
			temp.push(n);
			
		}
		num.push(n);

	}

	public int pop() {
		if (num.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}

		temp.pop();
		int v = num.pop();
		return v;
	}

	public int getMin() {
		return temp.peek();

	}
	
	public static void main(String[] args) {
		Main m=new Main();
		m.push(3);
		m.push(4);
		m.push(5);
		m.push(1);
		m.push(2);
		m.push(1);
		m.pop();
		m.pop();
		m.pop();
		System.out.println(m.getMin());
	}
}

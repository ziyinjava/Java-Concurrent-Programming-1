package test;

import java.util.concurrent.LinkedBlockingDeque;

public class pollFirst_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
		System.out.println(deque.pollFirst());
	}

}

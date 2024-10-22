package collection.Queue_Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("java");
		queue.add("html");
		queue.add("css");
		queue.add("javascript");
		queue.add("php");
		queue.add("mysql");

		System.out.println("Queue elements are : " + queue);

	}

}

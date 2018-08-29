 package dev;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
			PriorityQueue q=new PriorityQueue();
			
			q.offer("dev");
			q.offer("satya");
			q.offer("sipu");
			
			//in queue only accept the homogenious type of element 
			
			//q.offer(15);
			
			System.out.println(q);

	}

}

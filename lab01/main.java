package lab01;

public class main {

	 public static void main(String[] args) {
	        QueueX queue = new QueueX(10); 

	       
	        queue.insert(10);
	        queue.insert(25);
	        queue.insert(55);
	        queue.insert(65);
	        queue.insert(85);

	        // Delete and display
	        System.out.println("Deleted items,");
	        while (!(queue.nItems == 0)) { //until queue is emplty 
	            System.out.println(queue.remove());
	        }
	    }
	}



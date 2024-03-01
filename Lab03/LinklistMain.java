package Lab03;

public class LinklistMain {

	public static void main(String[] args) {
		
		Linklist student = new Linklist();
		
		student.insertFirst("nipuna", 69.5);
		student.insertFirst("Aravindu", 78.0);
		student.insertFirst("prashani",53.5);
		
		student.DisplayDetails();
		
		student.deleteLink("Aravindu");
		
		System.out.println();
		System.out.println("-----------Deleted Recorded----------");
		System.out.println();
		
		student.DisplayDetails();
		

	}

}


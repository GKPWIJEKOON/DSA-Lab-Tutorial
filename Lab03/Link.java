package Lab03;

public class Link {
	
	public double avg;
	public String name;
	public Link next;
	
	public Link(String name,Double avg)
	{
		this.name=name;
		this.avg=avg;
		this.next=null;
	}
	public void DisplayDetails() 
	{
		System.out.println("Name : \t" +name+ "Average : \t " +avg);
	}

}

package Lab03;

public class LinkMain {

	public static void main(String[] args) 
	{
		Link Nipuna = new Link("Nipuna",53.2);
		Link Aravindu = new Link("Nipuna",78.0);
		Link Prashani = new Link("Prashani",69.5);
		
		Nipuna.next=Aravindu;
		Aravindu.next=Prashani;
		Prashani.next=null;
		
		Nipuna.DisplayDetails();
		Aravindu.DisplayDetails();
		Prashani.DisplayDetails();
		
	}

}

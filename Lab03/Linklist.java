package Lab03;

public class Linklist
{
	private Link first;
	
	public Linklist() 
	{
		first=null;
	}
	
	public boolean isEmpty() 
	{
		return (first == null);
	}
	public void DisplayDetails()
	{
		Link current = first;
		while(current!=null) 
		{
			current.DisplayDetails();
			current=current.next;
		}
			
	}
	public void insertFirst(String name ,Double avg) 
	{
		Link newlink= new Link(name,avg);
		newlink.next=first;
		first=newlink;
		
	}
	public Link deletefirst() 
	{
		Link temp =first;
		first=first.next;
		return temp;			
	}
	public Link deleteLink(String name) 
	{
		Link current =first;
		Link previous =first;
		
		if(current==null) 
		{
			return null;
		}
		while(!current.name.equals(name)) 
		{
			previous = current;
			current= current.next;
			
			if(current==null)
			{
				return null;
				
			}
			
		}
		if(current==first) {
			first=first.next;
		}else 
		{
			previous.next=current.next;
		}
		return current;
	}
	
	
}


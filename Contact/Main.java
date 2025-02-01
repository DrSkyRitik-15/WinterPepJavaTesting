package Contact;
import java.util.*;


public class Main {
	public static void main(String[]args)
	{
		Contacts c1=new Contacts("Ritik","Singh","96362122");
		Contacts c2=new Contacts("Pitik","Singh","96362122");
		Contacts c3=new Contacts("Titik","Singh","96362122");
		
		Contacts[]mycontactsList= {c1,c2,c3};
		
		ContactList md= new ContactList(mycontactsList);
		md.getTotal();
		
		
		
		Contacts c =md.getContactObj( "Pitik","Singh");
		if(c!=null) {
			c.makeCall();
		}
	}
}
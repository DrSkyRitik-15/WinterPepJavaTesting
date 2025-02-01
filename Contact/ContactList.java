package Contact;

public class ContactList {

	Contacts[]myContacts;
	
	ContactList(Contacts[] myContacts)
	{
		this.myContacts=new Contacts[myContacts.length];
		int n=myContacts.length;
		
		for(int i=0;i<n;i++)
		{
			this.myContacts[i]=myContacts[i];
		}
	}
	
	public void getTotal() {
		
		System.out.println("TOtal number of list is "+myContacts.length);
		
	}
	
	
	public Contacts getContactObj(String firstname ,String lastname)
	{
		for(Contacts c:this.myContacts)
		{
			if((c.Firstname.equals(firstname))&&(c.lastName.equals(lastname))){
				System.out.println("Contact Found");
				c.makeCall();
				return c;
			}
		}
		System.out.println("Not found in our List");
		return null;
	}
}

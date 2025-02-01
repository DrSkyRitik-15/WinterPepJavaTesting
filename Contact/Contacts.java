package Contact;

class Contacts {
	String Firstname;
	String lastName;
	String phoneNumber;

	Contacts(String a, String b, String c) {
		this.Firstname = a;
		this.lastName = b;
		this.phoneNumber = c;

	}

	

	public void makeCall() {

		System.out.println("Calling phone Number" + this.phoneNumber);

	}

	public void acceptCall() {
		System.out.println("Make a call");
	}

	public void RejectCall() {

		System.out.println("Reject a call");

	}

}
class LinkedlnRunner{

public static void main(String[]job){
	
	System.out.println("Main started");
	boolean account = Linkedln.createLinkedlnAccount("Dhruv","GR","dhruv@gmail.com","dhruv2002","dhruv2002","India",577129,"Microsoft","SDE","IT","BE in CSE");
	
	if(account == true)
	Linkedln.readLinkedlnAccount();
	
	
	System.out.println("Main ended");
}
}
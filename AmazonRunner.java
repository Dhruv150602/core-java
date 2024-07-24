class AmazonRunner{

    public static void main(String[] amazon){
	
	    System.out.println("Main Started");
		boolean accountCreate =CreateAmazonAccount.createUserAccount("Dhruv", "GR", 9746751870L, "dhruv@gmail.com", "dhruv2002", "dhruv2002");
		
		if(accountCreate == true)
		CreateAmazonAccount.readAccountDetails();
		
		System.out.println("Main Ended");
	
	}
}
class BankAccountRunner{

    public static void main(String[] bank){
	
	    System.out.println("Main Started");
	    boolean accountCreated = BankAccountGeneration.createCustomerBankAccount("Dhruv", 685145326578L, "15/06/20032", "Shivamogga", 8463706209L);
		
		if(accountCreated == true)
		BankAccountGeneration.readCustomerBankAccountDetails();
		
		System.out.println("Main Ended");
	}
}
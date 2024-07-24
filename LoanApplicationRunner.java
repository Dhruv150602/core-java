class LoanApplicationRunner{

	public static void main(String[] loan){
	
		boolean loanApli = LoanApplication.createLoanApplication(800,"Dhruv" ,"Home Loan", "Axis", 10, 5);
	
		if(loanApli == true)
		LoanApplication.readApplicantDetails();
	}
}
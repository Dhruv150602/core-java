class PassportGenerationRunner{

	public static void main(String[] passport){
	
		boolean createPassport = PassportGrneration.createUserPassport("PO", "Bengaluru", "Dhruv", "GR", "08/01/2003", "dhruv@gmail.com", true, "dhruv2020", "Dhurv", "Dhruv", "School", "BVB", "123wedw");
	
		if(createPassport == true)
		PassportGrneration.readUserPassportDetails();
	}
}
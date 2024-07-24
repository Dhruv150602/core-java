class SpotifyAccountRunner{

	public static void main(String[] spotify){
	
		boolean createAcc = SpotifyAccount.createAccount("Dhruv","08/01/2003" ,"dhruv@gmail.com", "dhruv2020", "Dhruv", "Dhruv");
	
		if(createAcc == true)
		SpotifyAccount.readUserAccountDetails();
	}
}
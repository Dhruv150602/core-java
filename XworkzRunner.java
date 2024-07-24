class XworkzRunner{
	
	public static void main(String[] register){
		
		
		
	System.out.println("Main started");
	
	boolean registration = Xworkz.createTraineeRegistration("Dhruv",9676523656L,9986321560L,"Dhruv@gmail.com","2jn20cs000","ise","BE",2024);
	
	
	if(registration == true)
	Xworkz.readTraineeRegistration();
	
	System.out.println("Main ended");
	}

}
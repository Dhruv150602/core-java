class Xworkz{

	static String name;
	static long contNum;
	static long wtsAppNum;
	static String emailId;
	static String registerNo;
	static String branchName;
	static String degree;
	static int yearOfPass;

	public static boolean createTraineeRegistration(String fullName, long contactNum, long whatsAppNum, String email, String usnNo, String stream, String qualification, int passOutYear){
		boolean isTraineeRegistrated = validationDetails(fullName,contactNum,whatsAppNum,email,usnNo,stream,qualification,passOutYear);
	return isTraineeRegistrated;
	}
	
	public static boolean validationDetails(String fullName, long contactNum, long whatsAppNum, String email, String usnNo, String stream, String qualification, int passOutYear){
		boolean isDataValidated = false;
	
		boolean isFullName = false;
		boolean isContactNumber = false;
		boolean isWhatsapp = false;
		boolean isEmail = false;
		boolean isRegNo = false;
		boolean isBranchName = false;
		boolean isDegree = false;
		boolean isPassOutYear = false;
		
		if(fullName != null){
			name=fullName;
			isFullName = true;
		}else
			System.out.println("Invalid name");
		
		if(contactNum != 0){
			contNum=contactNum;
			isContactNumber = true;
		}else
			System.out.println("Invalid Contact number");
		
		if(whatsAppNum != 0){
			wtsAppNum=whatsAppNum;
			isWhatsapp = true;
		}else
			System.out.println("Invalid Whatsapp number");
		
		if(email != null){
			emailId=email;
			isEmail = true;
		}else
			System.out.println("Invalid email");
		
		if(usnNo != null){
			registerNo=usnNo;
			isRegNo = true;
		}else
			System.out.println("Invalid usnNo");
		
		if(stream != null){
			branchName=stream;
			isBranchName = true;
		}else
			System.out.println("Invalid stream");
		
		if(qualification != null){
			degree=qualification;
			isDegree = true;
		}else
			System.out.println("Invalid qualification");
		
		if(passOutYear != 0){
			yearOfPass=passOutYear;
			isPassOutYear = true;
		}else
			System.out.println("Invalid passOutYear");
		
	
		if(isFullName == true && isContactNumber == true && isRegNo == true && isWhatsapp == true && isEmail == true && isBranchName == true && isDegree == true && isPassOutYear == true)
			isDataValidated = true;
	
	return isDataValidated;
}
    
	public static void readTraineeRegistration(){
		
		System.out.println("Fetching Details");
		System.out.println("Trainee Name is :"+name);
		System.out.println("Trainee Contact No :"+contNum);
		System.out.println("Trainee Whatsapp No :"+wtsAppNum);
		System.out.println("Trainee Email :"+emailId);
		System.out.println("Trainee USN :"+registerNo);
		System.out.println("Trainee Stream Name :"+branchName);
		System.out.println("Trainee Qualification :"+degree);
		System.out.println("Trainee PassOut Year :"+yearOfPass);
		
	}
}
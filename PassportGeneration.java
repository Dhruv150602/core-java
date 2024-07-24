class PassportGrneration{
	
	static String cpvLoc;
	static String dcdrLoc;
	static String name;
	static String givenSurName;
	static String dofb;
	static String eMail;
	static boolean isSameEmailLogin;
	static String loginId;
	static String pswd;
	static String conformPswd;
	static String hintQuestion;
	static String hintAnswer;
	static String capt;
	
	public static boolean createUserPassport(String cpvLocation, String dcdrLocation, String givenName,String surName,String dob,String email,boolean isEmailLoginSame,String loginID,String pwd,String conformPwd,String hintQues,String hintAns,String capture){
	
	return dataValidate(cpvLocation,dcdrLocation,givenName,surName,dob,email,isEmailLoginSame,loginID,pwd,conformPwd,hintQues,hintAns,capture);
	}
	
	public static boolean dataValidate(String cpvLocation, String dcdrLocation, String givenName,String surName,String dob,String email,boolean isEmailLoginSame,String loginID,String pwd,String conformPwd,String hintQues,String hintAns,String capture){
		boolean isDataValidated = false;
		
		boolean isCpvLocationValid = false;
		boolean isDcdrLocationValid = false;
		boolean isGivenNameValid = false;
		boolean isGivenSurName = false;
		boolean isDob = false;
		boolean isEmail = false;
		
		boolean isLoginID = false;
		boolean isPwd = false;
		boolean isConformPwd = false;
		boolean isHintQues = false;
		boolean isHintAns = false;
		boolean isCapture = false;
		
		if(cpvLocation != null){
			cpvLoc = cpvLocation;
			isCpvLocationValid = true;
		}else 
			System.out.println("cpv Location is invalid");
		
		if(dcdrLocation != null){
			dcdrLoc = dcdrLocation;
			isDcdrLocationValid =true;
		}else
			System.out.println("dcdr location is invalid");
		
		if(givenName != null){
			name = givenName;
			isGivenNameValid = true;
		}else
			System.out.println("Name is invalid");
		
		if(surName != null){
			givenSurName = surName;
			isGivenSurName = true;
		}else
			System.out.println("Surname is invalid");
		
		if(dob != null){
			dofb = dob;
			isDob = true;
		}else
			System.out.println("DOB is invalid");
		
		if(email != null){
			eMail = email;
			isEmail = true;
		}else
			System.out.println("email is invalid");
		
		isSameEmailLogin = isEmailLoginSame;
		
		if(loginID != null){
			loginId = loginID;
			isLoginID = true;
		}else
			System.out.println("loginid is invalid");
		
		if(pwd != null){
			pswd = pwd;
			isPwd = true;
		}else
			System.out.println("password is invalid");
		
		if(conformPwd != null){
			conformPswd = conformPwd;
			isConformPwd = true;
		}else
			System.out.println("conform password is invalid");
		
		if(hintQues != null){
			hintQuestion = hintQues;
			isHintQues = true;
		}else
			System.out.println("hint question is invalid");
		
		if(hintAns != null){
			hintAnswer = hintAns;
			isHintAns = true;
		}else
			System.out.println("hint answer is invalid");
		
		if(capture != null){
			capt = capture;
			isCapture = true;
		}else
			System.out.println("capture is invalid");
		
		/*cpvLoc = cpvLocation;
		dcdrLoc = dcdrLocation;
		name = givenName;
		givenSurName = surName;
		dofb = dob;
		eMail = email;
		isSameEmailLogin = isEmailLoginSame;
		loginId = loginID;
		pswd = pwd;
		conformPswd = conformPwd;
		hintQuestion = hintQues;
		hintAnswer = hintAns;
		capt = capture;
		
		isPassportCreated = true;*/
		
	if(isCpvLocationValid == true && isDcdrLocationValid == true && isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isGivenSurName == true && isDob == true && isEmail == true && isLoginID == true && isPwd == true && isConformPwd == true && isHintQues == true && isHintAns == true && isCapture == true  )
		isDataValidated = true;
	
	return isDataValidated;
	}
	
	public static void readUserPassportDetails(){
		
		System.out.println("Fetching user details");
		
		System.out.println("The user CPV location is "+ cpvLoc);
		System.out.println("The user DCDR location is "+ dcdrLoc);
		System.out.println("The user First Name is "+ name);
		System.out.println("The user Surname is "+ givenSurName);
		System.out.println("The user date of Birth is "+dofb);
		System.out.println("The user Email is "+eMail);
		System.out.println("The user has same Email "+isSameEmailLogin);
		System.out.println("The user login id is "+ loginId);
		System.out.println("The user Password is "+ pswd);
		System.out.println("The user Conform Password is "+conformPswd);
		System.out.println("The user Hint Question is "+ hintQuestion);
		System.out.println("The user Answer for Question is "+hintAnswer);
		System.out.println("The Capture code is "+capt);
	return;
	}
}
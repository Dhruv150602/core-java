class Swiggy{
	public static void main(String[] item){
		System.out.println("Main started");
		
		String name = "Swiggy";
		String nonvegStarters[] = {"CHICKEN MANCHURIAN","CHICKEN CHILLI/CRISPY","CHICKEN LEMON/GINGER","CHICKEN PEPPER","CHICKEN CORIANDER","CHICKEN PUDINA","CHICKEN SHANGRILLA","CHICKEN MAJESTIC","PERI PERI CHICKEN","SCHEZWAN CHICKEN"};
		String vegStarters[] = {"PANEER CHILLY","PANEER MANCHURIAN","PANEER PEPPER","MUSHROOM PEPPER","MUSHROOM CHILLY","MUSHROOM MANCHURIAN","BABY CORN CHILLY","DRY GOBI","GOBI MANCHURIAN","BABY CORN"};
		String nonvegMainCourses[] = {"BUTTER CHICKEN","KADHAI CHICKEN","CHICKEN MANCHOW","CHICKEN NOODLE","EGG CHOWMEIN","TIKKA MASALA","CHICKEN CHOWMEIN","CHICKEN BIRYANI","CHICKEN CHOWMEIN","EGG BIRYANI","TANDOORI CHICKEN"};
		String vegMainCourses[] = {"KERALA PARATHA","CYLON PARATHAJZ","PAPS PAROTHA","MALAI KOFTA","KONDATTAM MORU KULAMBU","PANEER LABABDAR","BAINGAN BHARTA","KAPPA THALICHATHU","VEG TULUNADU MAIN COURSE GASSI","CHANA MASALA"};
		
		System.out.println("Welcome to "+name);
		System.out.println("*");
		//System.out.println("AVAILABLE NON VEG STARTER ARE \n"+nonvegStarters[0]+"\n"+nonvegStarters[1]+"\n"+nonvegStarters[2]+"\n"+nonvegStarters[3]+"\n"+nonvegStarters[4]+"\n"+nonvegStarters[5]+"\n"+nonvegStarters[6]+"\n"+nonvegStarters[7]+"\n"+nonvegStarters[8]+"\n"+nonvegStarters[9]);
		System.out.println("AVAILABLE NON VEG STARTER ARE");
		for (String nonvegStarter : nonvegStarters){
			System.out.println(nonvegStarter);
		}
		
		System.out.println("*");
		//System.out.println("AVAILABLE VEG STARTER ARE \n"+vegStarters[0]+"\n"+vegStarters[1]+"\n"+vegStarters[2]+"\n"+vegStarters[3]+"\n"+vegStarters[4]+"\n"+vegStarters[5]+"\n"+vegStarters[6]+"\n"+vegStarters[7]+"\n"+vegStarters[8]+"\n"+vegStarters[9]);
		System.out.println("AVAILABLE VEG STARTER ARE");
		for (String vegStarter : vegStarters){
			System.out.println(vegStarter);
		}
		
		System.out.println("*");
		//System.out.println("AVAILABLE NON VEG MAIN COURSE ARE \n"+nonvegMainCourses[0]+"\n"+nonvegMainCourses[1]+"\n"+nonvegMainCourses[2]+"\n"+nonvegMainCourses[3]+"\n"+nonvegMainCourses[4]+"\n"+nonvegMainCourses[5]+"\n"+nonvegMainCourses[6]+"\n"+nonvegMainCourses[7]+"\n"+nonvegMainCourses[8]+"\n"+nonvegMainCourses[9]);
		System.out.println("AVAILABLE NON VEG MAIN COURSE ARE");
		for (String nonvegMainCourse : nonvegMainCourses){
			System.out.println(nonvegMainCourse);
		}
		
		System.out.println("*");
		//System.out.println("AVAILABLE VEG MAIN COURSE ARE \n"+vegMainCourses[0]+"\n"+vegMainCourses[1]+"\n"+vegMainCourses[2]+"\n"+vegMainCourses[3]+"\n"+vegMainCourses[4]+"\n"+vegMainCourses[5]+"\n"+vegMainCourses[6]+"\n"+vegMainCourses[7]+"\n"+vegMainCourses[8]+"\n"+vegMainCourses[9]);
		System.out.println("AVAILABLE VEG MAIN COURSE ARE");
		for (String vegMainCourse : vegMainCourses){
			System.out.println(vegMainCourse);
		}
		
		System.out.println("*");
		
		System.out.println("Main ended");
		
	}
}
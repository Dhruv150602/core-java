class Hotel{
	public static void main(String[] foodmenu){
		System.out.println("Main started");
		
		String name = "Ganesh Grand";
		String foodMenu[] = {"Biriyani", "Paneer Butter Masala", "Sayi Paneer Kema Paneer", "Chicken Dam Biriyani","Egg Biriyani", "Paneer Burji","Palak Paneer Matter Paneer","Veg Biriyani","Paneer Chilly","Gee Rice","Paneer Manchurian","Jeera Rice","Dal Fry Tadka","White Rice Meals","Tomato Fry","Green Pees Masala","Boil Rice Meals","Channa Masala","Rajuma Masala","Fried Rice","Chicken Fried Rice","Egg Fried Rice","Mashroom Masala","Gobi Fried Rice","Aloo Gobi Shabji"};
		
		System.out.println("Welcome to "+name);
		System.out.println("*");
		System.out.println("------MENU------");
		System.out.println("*");
		//System.out.println(foodMenu[0]+"\n"+foodMenu[1]+"\n"+foodMenu[2]+"\n"+foodMenu[3]+"\n"+foodMenu[4]+"\n"+foodMenu[5]+"\n"+foodMenu[6]+"\n"+foodMenu[7]+"\n"+foodMenu[8]+"\n"+foodMenu[9]+"\n"+foodMenu[10]+"\n"+foodMenu[11]+"\n"+foodMenu[12]+"\n"+foodMenu[13]+"\n"+foodMenu[14]+"\n"+foodMenu[15]+"\n"+foodMenu[16]+"\n"+foodMenu[17]+"\n"+foodMenu[18]+"\n"+foodMenu[19]+"\n"+foodMenu[20]+"\n"+foodMenu[21]+"\n"+foodMenu[22]+"\n"+foodMenu[23]+"\n"+foodMenu[24]);
		for (String food : foodMenu){
			System.out.println(food);
		}
		
		System.out.println("*");
		
		System.out.println("Main ended");
		
	}
}
class SuperMarket{
	public static void main(String[] market){
		System.out.println("Main started");
		
		String name = "AK Super Market";
		String groceries[]={"urad dal", "Wheat", "Rice", "Sugar", "Egg", "Bread", "Ragi", "salt", "pepper", "Mashroom", "Chan dal","pasta","meat","chickpea","dry ginger"};
		String vegetables[]={"Carrot", "Beans", "Ladie's fingers", "Onion", "Spinach", "Beetroot", "Black eyed beans", "broccoli", "dill", "endive"};
		String fruits[]={"Apple", "banana", "cherry", "fig", "blueberry", "guava", "grapes", "kiwi", "watermelon", "pineapple"};
		String perfumes[] ={"Wild Stone","Embark","Jaguar","Nautica","Davidoff","Dior","Calvin Klein","Dior Sauvage Eau de Parfum","Creed Aventus","Tom Ford Oud Wood","Bleu de Chanel","Acqua di Giò  Giorgio Armani","Yves Saint Laurent La Nuit de L'Homme","Paco Rabanne","Viktor & Rolf Spicebomb"};
		String iceCream[] ={"Vanilla ice cream","Baskin-Robbins","chocolates chip cookie dough ice cream","chocolates ice cream","Cookies and cream","Butter pecan","chocolates","Cold Stone Creamery","Häagen-Dazs","Natural Ice Cream","Green tea ice cream","Beckon Ice Cream","Banana ice cream","Strawberry ice cream","Mint chocolates chip"};
		String cosmetics[] ={"Mascara","Eyeshadow","Eyeliner","Foundation","Concealer","Blush","Makeup brushes","Lipstick","Compact powders","Primer","Setting Spray","Kajal","Highlighter","Contour","Bronzer"};
		String coolDrinks[] ={"Fanta","Campa Cola","Coca-Cola","Lemon","Canada Dry","Eskimo soft drinks","Ginger ale","RC Cola","J2O","Minute Maid","Mirinda","Energy drink","Mountain Dew","Sprite","Pepsi"};
		String alcohols[] ={"Absolut","Bacardi","Jack Daniel","Hennessy","Smirnoff","Crown Royal","Grey Goose","Chivas Regal","Captain Morgan","Johnnie Walker","Jägermeister","Jim Beam","Patrón","Baileys","Ballantine"};
		String milkProducts[] ={"Milk","Milk Powder","Cream","Whey","Butter","Fermented","Yogurt","Cheese","Custard","Frozen"};
		String snacks[] ={"tortilla chips","corn chips","potato chips","extruded products","pork rinds","pretzels","popcorn","nuts","seeds","Bhel Puri","Samosa"};
		String chocolates[] ={"Ferrero Rocher","Amul","Cadbury","Hershey chocolates","Toblerone chocolates","Ghirardelli","Lindt","Fabelle","Lotus chocolates","Mars","Cadbury Dairy Milk chocolates Bar","Fabelle tiramisu chocolates","Lindt napolitains assorted pack","Pacari chocolates","Bogatchi"};
		String homeAppliances[] ={"Microwave","Kettle","Refrigerator","Oven","Blender","Coffeemaker","Fan","Toaster","Air Conditioner","Television","Washing Machine","Food Processor","Juicer","Cleaning items","Dishwasher","Furniture","Gas Cooker","Rice cookers","Air Fryer","Computer"};
		
		
		System.out.println("Welcome to "+name);
		System.out.println("*");
		//System.out.println("Available groceries are \n"+groceries[0]+"\n"+groceries[1]+"\n"+groceries[2]+"\n"+groceries[3]+"\n"+groceries[4]+"\n"+groceries[5]+"\n"+groceries[6]+"\n"+groceries[7]+"\n"+groceries[8]+"\n"+groceries[9]+"\n"+groceries[10]+"\n"+groceries[11]+"\n"+groceries[12]+"\n"+groceries[13]+"\n"+groceries[14]);
		System.out.println("Available groceries are");
		for (String grocery : groceries){
			System.out.println(grocery);
		}
		System.out.println("*");
		//System.out.println("Available vegetables are \n"+vegetables[0]+"\n"+vegetables[1]+"\n"+vegetables[2]+"\n"+vegetables[3]+"\n"+vegetables[4]+"\n"+vegetables[5]+"\n"+vegetables[6]+"\n"+vegetables[7]+"\n"+vegetables[8]+"\n"+vegetables[9]);
		System.out.println("Available vegetables are");
		for (String vegetable : vegetables){
			System.out.println(vegetable);
		}
		
		System.out.println("*");
		//System.out.println("Available fruits are \n"+fruits[0]+"\n"+fruits[1]+"\n"+fruits[2]+"\n"+fruits[3]+"\n"+fruits[4]+"\n"+fruits[5]+"\n"+fruits[6]+"\n"+fruits[7]+"\n"+fruits[8]+"\n"+fruits[9]);
		System.out.println("Available fruits are");
		for (String fruit : fruits){
			System.out.println(fruit);
		}
		
		System.out.println("*");
		//System.out.println("Available perfumes are \n"+perfumes[0]+"\n"+perfumes[1]+"\n"+perfumes[2]+"\n"+perfumes[3]+"\n"+perfumes[4]+"\n"+perfumes[5]+"\n"+perfumes[6]+"\n"+perfumes[7]+"\n"+perfumes[8]+"\n"+perfumes[9]+"\n"+perfumes[10]+"\n"+perfumes[11]+"\n"+perfumes[12]+"\n"+perfumes[13]+"\n"+perfumes[14]);
		System.out.println("Available perfumes are");
		for (String perfume : perfumes){
			System.out.println(perfume);
		}
		
		System.out.println("*");
		//System.out.println("Available iceCream are \n"+iceCream[0]+"\n"+iceCream[1]+"\n"+iceCream[2]+"\n"+iceCream[3]+"\n"+iceCream[4]+"\n"+iceCream[5]+"\n"+iceCream[6]+"\n"+iceCream[7]+"\n"+iceCream[8]+"\n"+iceCream[9]+"\n"+iceCream[10]+"\n"+iceCream[11]+"\n"+iceCream[12]+"\n"+iceCream[13]+"\n"+iceCream[14]);
		System.out.println("Available iceCream are");
		for (String ice : iceCream){
			System.out.println(ice);
		}
		
		System.out.println("*");
		//System.out.println("Available cosmetics are \n"+cosmetics[0]+"\n"+cosmetics[1]+"\n"+cosmetics[2]+"\n"+cosmetics[3]+"\n"+cosmetics[4]+"\n"+cosmetics[5]+"\n"+cosmetics[6]+"\n"+cosmetics[7]+"\n"+cosmetics[8]+"\n"+cosmetics[9]+"\n"+cosmetics[10]+"\n"+cosmetics[11]+"\n"+cosmetics[12]+"\n"+cosmetics[13]+"\n"+cosmetics[14]);
		System.out.println("Available cosmetics are");
		for (String cosmetic : cosmetics){
			System.out.println(cosmetic);
		}
		
		System.out.println("*");
		//System.out.println("Available Cool Drinks are \n"+coolDrinks[0]+"\n"+coolDrinks[1]+"\n"+coolDrinks[2]+"\n"+coolDrinks[3]+"\n"+coolDrinks[4]+"\n"+coolDrinks[5]+"\n"+coolDrinks[6]+"\n"+coolDrinks[7]+"\n"+coolDrinks[8]+"\n"+coolDrinks[9]+"\n"+coolDrinks[10]+"\n"+coolDrinks[11]+"\n"+coolDrinks[12]+"\n"+coolDrinks[13]+"\n"+coolDrinks[14]);
		System.out.println("Available Cool Drinks are");
		for (String coolDrink : coolDrinks){
			System.out.println(coolDrink);
		}
		
		System.out.println("*");
		//System.out.println("Available alcohols are \n"+alcohols[0]+"\n"+alcohols[1]+"\n"+alcohols[2]+"\n"+alcohols[3]+"\n"+alcohols[4]+"\n"+alcohols[5]+"\n"+alcohols[6]+"\n"+alcohols[7]+"\n"+alcohols[8]+"\n"+alcohols[9]+"\n"+alcohols[10]+"\n"+alcohols[11]+"\n"+alcohols[12]+"\n"+alcohols[13]+"\n"+alcohols[14]);
		System.out.println("Available alcohols are");
		for (String alcohol : alcohols){
			System.out.println(alcohol);
		}
		
		System.out.println("*");
		//System.out.println("Available Milk Products are \n"+milkProducts[0]+"\n"+milkProducts[1]+"\n"+milkProducts[2]+"\n"+milkProducts[3]+"\n"+milkProducts[4]+"\n"+milkProducts[5]+"\n"+milkProducts[6]+"\n"+milkProducts[7]+"\n"+milkProducts[8]+"\n"+milkProducts[9]);
		System.out.println("Available Milk Products are");
		for (String milkProduct : milkProducts){
			System.out.println(milkProduct);
		}
		
		System.out.println("*");
		//System.out.println("Available snacks are \n"+snacks[0]+"\n"+snacks[1]+"\n"+snacks[2]+"\n"+snacks[3]+"\n"+snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n"+snacks[7]+"\n"+snacks[8]+"\n"+snacks[9]);
		System.out.println("Available snacks are");
		for (String snack : snacks){
			System.out.println(snack);
		}
		
		System.out.println("*");
		//System.out.println("Available chocolates are \n"+chocolates[0]+"\n"+chocolates[1]+"\n"+chocolates[2]+"\n"+chocolates[3]+"\n"+chocolates[4]+"\n"+chocolates[5]+"\n"+chocolates[6]+"\n"+chocolates[7]+"\n"+chocolates[8]+"\n"+chocolates[9]+"\n"+chocolates[10]+"\n"+chocolates[11]+"\n"+chocolates[12]+"\n"+chocolates[13]+"\n"+chocolates[14]);
		System.out.println("Available chocolates are");
		for (String chocolate : chocolates){
			System.out.println(chocolate);
		}
		
		System.out.println("*");
		//System.out.println("Available Home Appliances are \n"+homeAppliances[0]+"\n"+homeAppliances[1]+"\n"+homeAppliances[2]+"\n"+homeAppliances[3]+"\n"+homeAppliances[4]+"\n"+homeAppliances[5]+"\n"+homeAppliances[6]+"\n"+homeAppliances[7]+"\n"+homeAppliances[8]+"\n"+homeAppliances[9]+"\n"+homeAppliances[10]+"\n"+homeAppliances[11]+"\n"+homeAppliances[12]+"\n"+homeAppliances[13]+"\n"+homeAppliances[14]+"\n"+homeAppliances[15]+"\n"+homeAppliances[16]+"\n"+homeAppliances[17]+"\n"+homeAppliances[18]+"\n"+homeAppliances[19]);
		System.out.println("Available Home Appliances are");
		for (String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
		
		System.out.println("*");
		
		
		
		System.out.println("Main ended");
	}
}
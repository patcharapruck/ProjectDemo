package com.company;

public class Main {

    public static void main(String[] args) {
    	Double bmi;
	    BoxV1 boxV1 = new BoxV1();
	   boxV1.setName("Naphatsanan Boonchom");
	   boxV1.setId(58011212107L);
	   boxV1.setAddress("House No.54 Village No. 18 Namkham Village " +
			   "Namkham Sub-district Thatphanom district Nakhonphanom Province " +
			   "Postal Code 48110");
	   boxV1.setHeight(165.0);
	   boxV1.setWeight(60.2);
	   bmi = boxV1.BMI();

	   System.out.println(bmi);

	   if (bmi<=18.5){
		   System.out.println("You thin");
	   }
		else if (bmi<=22.9){
			System.out.println("You Good");
		}
	   else if (bmi<=24.9){
		   System.out.println("You Over weight");
	   }
	   else if (bmi<=29.9){
		   System.out.println("You Fat");
	   }
	   else{
		   System.out.println("You Vary Fat");
	   }




    }
}

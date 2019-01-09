package com.company;

public class Main {

    public static void main(String[] args) {
	    BoxV1 boxV1 = new BoxV1();
	   boxV1.setName("Naphatsanan Boonchom");
	   boxV1.setId(58011212107L);
	   boxV1.setAddress("House No.54 Village No. 18 Namkham Village " +
			   "Namkham Sub-district Thatphanom district Nakhonphanom Province " +
			   "Postal Code 48110");
	   boxV1.setHeight(165.0);
	   boxV1.setWeight(60.2);
	   System.out.println( boxV1.BMI());




    }
}

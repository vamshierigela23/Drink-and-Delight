package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.DrinkService;

public class DrinkUI {
public static void main(String[] args) {
	String rawmaterialorderId;
	String rawmaterialname;
	double rawmaterialprice_per_unit;
	double rawmaterialquantityvalue;
	double rawmaterialquantityUnit;
	double rawmaterialprice;
	String rawmaterialwarehouseId;
	String rawmaterialdeliveryDate;
	String rawmaterialmanufacturingDate;
	String rawmaterialexpiryDate;
	String rawmaterialprocessDate;
	String productorderId;
	String productname;
	double productprice_per_unit;
	double productquantityvalue;
	double productquantityUnit;
	double productprice;
	String productwarehouseId;
	String productdeliveryDate;
	String productmanufacturingDate;
	String productexpiryDate;
	String productprocessDate;
	 @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	 DrinkService drinkService =new DrinkService();
	 System.out.println("1. RawmaterialStock\n 2. ProductStock");
	 System.out.println("Select Choice: ");
	 int ch=s.nextInt();
	 switch(ch)
	 {
	 case 1:
	 System.out.println("enter RawMaterialorderid");
		rawmaterialorderId=s.next();
		s.nextLine();
		System.out.println("enter RawMaterialname");
		rawmaterialname=s.next();
		s.nextLine();
		System.out.println("enter RawMaterialprice_per_unit");
		rawmaterialprice_per_unit=s.nextDouble();
		s.nextLine();
		System.out.println("enter RawMaterialquantityValue");
		rawmaterialquantityvalue=s.nextDouble();
		s.nextLine();
		System.out.println("enter RawMaterialquantityunit");
		rawmaterialquantityUnit=s.nextDouble();
		s.nextLine();
		System.out.println("enter RawMaterialprice");
		rawmaterialprice=s.nextDouble();
		s.nextLine();
		System.out.println("enter RawMaterialwarehouseid");
		rawmaterialwarehouseId=s.next();
		s.nextLine();
		System.out.println("enter RawMaterialdeliveryDate");
		rawmaterialdeliveryDate=s.next();
		System.out.println("enter RawMaterialmanufacturingDate");
		rawmaterialmanufacturingDate= s.next();
		System.out.println("enter RawMaterialexpiryDate");
		rawmaterialexpiryDate= s.next();
		System.out.println("enter RawMaterialprocessDate");
		rawmaterialprocessDate= s.next();
		DrinkService drinkService1=new DrinkService(); 
		int updateCount=drinkService1.addDrink(rawmaterialorderId,rawmaterialname,rawmaterialprice_per_unit, rawmaterialquantityvalue, rawmaterialquantityUnit, rawmaterialprice, rawmaterialwarehouseId,rawmaterialdeliveryDate,rawmaterialmanufacturingDate,rawmaterialexpiryDate,rawmaterialprocessDate);
		System.out.println(updateCount);
		break;
	 case 2:
		 System.out.println("enter Productorderid");
			productorderId=s.next();
			s.nextLine();
			System.out.println("enter Productname");
			productname=s.next();
			s.nextLine();
			System.out.println("enter Productprice_per_unit");
			productprice_per_unit=s.nextDouble();
			s.nextLine();
			System.out.println("enter ProductquantityValue");
			productquantityvalue=s.nextDouble();
			s.nextLine();
			System.out.println("enter Productquantityunit");
			productquantityUnit=s.nextDouble();
			s.nextLine();
			System.out.println("enter Productprice");
			productprice=s.nextDouble();
			s.nextLine();
			System.out.println("enter Productwarehouseid");
			productwarehouseId=s.next();
			s.nextLine();
			System.out.println("enter ProductdeliveryDate");
			productdeliveryDate=s.next();
			System.out.println("enter ProductmanufacturingDate");
			productmanufacturingDate= s.next();
			System.out.println("enter ProductexpiryDate");
			productexpiryDate= s.next();
			System.out.println("enter ProductprocessDate");
			productprocessDate= s.next();
			int updateCount1=drinkService.addDrink1(productorderId,productname,productprice_per_unit, productquantityvalue, productquantityUnit,productprice, productwarehouseId,productdeliveryDate,productmanufacturingDate,productexpiryDate,productprocessDate);
			System.out.println(updateCount1);
			break;
	 }
}
}

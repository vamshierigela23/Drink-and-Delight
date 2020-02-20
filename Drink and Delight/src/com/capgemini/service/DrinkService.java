package com.capgemini.service;

import com.capgemini.bean.DrinkBean;
import com.capgemini.dao.DrinkDAO;

public class DrinkService {
	public int addDrink(String rawmaterialorderId,String rawmaterialname,double rawmaterialprice_per_unit,double rawmaterialquantityvalue,double rawmaterialquantityUnit,double rawmaterialprice,String rawmaterialwarehouseId,String rawmaterialdeliveryDate,String rawmaterialmanufacturingDate, String rawmaterialexpiryDate,String rawmaterialprocessDate){
		String rawmaterialqualityCheck="";
		if(rawmaterialprice<=100)
		{
			rawmaterialqualityCheck="C";
		}
		else if(rawmaterialprice<=600)
		{
			rawmaterialqualityCheck="B";
		}
		else
		{
			rawmaterialqualityCheck="A";
		}
		DrinkDAO drinkDAO=new DrinkDAO();
		DrinkBean drinkBean=new DrinkBean();
		drinkBean.setRawmaterialorderId(rawmaterialorderId);
		drinkBean.setRawmaterialname(rawmaterialname);
		drinkBean.setRawmaterialprice_per_unit(rawmaterialprice_per_unit);
		drinkBean.setRawmaterialquantityvalue(rawmaterialquantityvalue);
		drinkBean.setRawmaterialquantityUnit(rawmaterialquantityUnit);
		drinkBean.setRawmaterialprice(rawmaterialprice);
		drinkBean.setRawmaterialwarehouseId(rawmaterialwarehouseId);
		
		drinkBean.setRawmaterialdeliveryDate(rawmaterialdeliveryDate);
		
		drinkBean.setRawmaterialmanufacturingDate(rawmaterialmanufacturingDate);
	    
		drinkBean.setRawmaterialexpiryDate(rawmaterialexpiryDate);
		drinkBean.setRawmaterialqualityCheck(rawmaterialqualityCheck);
		
		drinkBean.setRawmaterialprocessDate(rawmaterialprocessDate);
		int updateResult=0;
		try{
		updateResult=drinkDAO.addDrink1(drinkBean);
		return updateResult;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
}
	public int addDrink1(String productorderId,String productname,double productprice_per_unit,double productquantityvalue,double productquantityUnit,double productprice,String productwarehouseId,String productdeliveryDate,String productmanufacturingDate, String productexpiryDate,String productprocessDate){
		String productqualityCheck="";
		if(productprice<=100)
		{
			productqualityCheck="C";
		}
		else if(productprice<=600)
		{
			productqualityCheck="B";
		}
		else
		{
			productqualityCheck="A";
		}
		DrinkDAO drinkDAO=new DrinkDAO();
		DrinkBean drinkBean=new DrinkBean();
		drinkBean.setProductorderId(productorderId);
		drinkBean.setProductname(productname);
		drinkBean.setProductprice_per_unit(productprice_per_unit);
		drinkBean.setProductquantityvalue(productquantityvalue);
		drinkBean.setProductquantityUnit(productquantityUnit);
		drinkBean.setProductprice(productprice);
		drinkBean.setProductwarehouseId(productwarehouseId);
		drinkBean.setProductdeliveryDate(productdeliveryDate);
		drinkBean.setProductmanufacturingDate(productmanufacturingDate);
		drinkBean.setProductexpiryDate(productexpiryDate);
		drinkBean.setProductqualityCheck(productqualityCheck);
		drinkBean.setProductprocessDate(productprocessDate);
		int updateResult=0;
		try{
		updateResult=drinkDAO.addDrink2(drinkBean);
		return updateResult;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
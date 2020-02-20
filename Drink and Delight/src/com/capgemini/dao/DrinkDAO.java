package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.capgemini.bean.DrinkBean;

public class DrinkDAO {
	public int addDrink1(DrinkBean drinkBean)
	{
		Connection con=null;
		PreparedStatement ps=null;
		try{
			con=DrinkDB.getConnection1();
			ps=con.prepareStatement("insert into RawMaterialStock values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, drinkBean.getRawmaterialorderId());
			ps.setString(2, drinkBean.getRawmaterialname());
			ps.setDouble(3, drinkBean.getRawmaterialprice_per_unit());
			ps.setDouble(4, drinkBean.getRawmaterialquantityvalue());
			ps.setDouble(5, drinkBean.getRawmaterialquantityUnit());
			ps.setDouble(6, drinkBean.getRawmaterialprice());
			ps.setString(7, drinkBean.getRawmaterialwarehouseId());
			ps.setString(8, drinkBean.getRawmaterialdeliveryDate());
			ps.setString(9, drinkBean.getRawmaterialmanufacturingDate());
			ps.setString(10, drinkBean.getRawmaterialexpiryDate());
			ps.setString(11, drinkBean.getRawmaterialqualityCheck());
			ps.setString(12, drinkBean.getRawmaterialprocessDate());
			int updateCount=ps.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	public int addDrink2(DrinkBean drinkBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try{
			con=DrinkDB.getConnection1();
			pst=con.prepareStatement("insert into ProductStock values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1,drinkBean.getProductorderId());
			pst.setString(2, drinkBean.getProductname());
			pst.setDouble(3, drinkBean.getProductprice_per_unit());
			pst.setDouble(4, drinkBean.getProductquantityvalue());
			pst.setDouble(5, drinkBean.getProductquantityUnit());
			pst.setDouble(6, drinkBean.getProductprice());
			pst.setString(7, drinkBean.getProductwarehouseId());
			pst.setString(8,drinkBean.getProductdeliveryDate());
			pst.setString(9, drinkBean.getProductmanufacturingDate());
			pst.setString(10, drinkBean.getProductexpiryDate());
			pst.setString(11, drinkBean.getProductqualityCheck());
			pst.setString(12, drinkBean.getProductprocessDate());
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	}

		
	



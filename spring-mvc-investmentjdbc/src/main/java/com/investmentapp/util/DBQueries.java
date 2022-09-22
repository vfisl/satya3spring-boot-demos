package com.investmentapp.util;

public class DBQueries {

	public static final String insertQUERY="insert into investment(plan_name,entry_age,type,amount,purpose,risk,nominee,term) values(?,?,?,?,?,?,?,?)";
	public static final String updateQUERY="update investment set amount=? where plan_id=?";
	public static final String deleteQuery="delete from investment where plan_id=?";
	public static final String SELECTQUERY="select * from investment";
	public static final String SELECTBYTYPE="select * from investment where type=?";
	public static final String SELECTBYPURPOSE="select *from investment where purpose=?";
	
	public static final String SELECTBYID="select * from investment where plan_id=?";
	public static final String SELECTBYTERM="select * from investment where type=?";
	public static final String SELECTBYRISKANDTERM="select * from investment where risk=? and term<?";
}
package com.pharmacystore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pharmacystore.model.Drugs;

public class PharmacyRowMapper implements RowMapper<Drugs> {

	@Override
	public Drugs mapRow(ResultSet rs, int rowNum) throws SQLException {
		Drugs drug=new Drugs();
		drug.setCategory(rs.getString("category"));
		drug.setType(rs.getString("type"));
		drug.setName(rs.getString("name"));
		drug.setDrugId(rs.getInt("drug_id"));
		return drug;
		
		
	}

}

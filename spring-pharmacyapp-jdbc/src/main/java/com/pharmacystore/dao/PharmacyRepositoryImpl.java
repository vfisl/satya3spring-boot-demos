package com.pharmacystore.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;
import com.pharmacystore.model.QueryClass;
@Repository
public class PharmacyRepositoryImpl implements IPharmacyRepository{
	  JdbcTemplate jdbcTemplate;
	    @Autowired
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		@Override
		public void addDrug(Drugs drug) {
			jdbcTemplate.update(QueryClass.INSERTQUERY,drug);
			
		}
		@Override
		public void deleteDrug(int  drugId) {
			jdbcTemplate.update(QueryClass.DELETEQuery,drugId);
			
		}
		@Override
		public void updateDrug(String category, int drugId) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public List<Drugs> findall() {
			return jdbcTemplate.query(QueryClass.SELECTQUERY, new PharmacyRowMapper());
		}
		@Override
		public List<Drugs> findByCategory(String category) throws DrugNotFoundException {
			return jdbcTemplate.query(QueryClass.SELECTBYCATEGORY ,new PharmacyRowMapper(),category);
		}
		@Override
		public Drugs findById(int drugID) throws DrugIdNotFoundException {
			return jdbcTemplate.query(QueryClass.SELECTBYID ,new PharmacyRowMapper(),drugID).stream().findFirst().get();
		}
	
}

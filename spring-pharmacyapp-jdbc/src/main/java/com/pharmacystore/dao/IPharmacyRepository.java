package com.pharmacystore.dao;

import java.util.List;

import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;

public interface IPharmacyRepository {
	public void addDrug(Drugs drug);
	public void deleteDrug(int drugId);
	public void updateDrug(String category, int drugID);
	public List<Drugs> findall();
	public List<Drugs> findByCategory(String category)throws DrugNotFoundException;
	public Drugs findById(int drugID)throws DrugIdNotFoundException;

}

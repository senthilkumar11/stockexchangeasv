package com.premium.stc.dao;


import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	List<Company> findBySectorId( int sectorId);
}

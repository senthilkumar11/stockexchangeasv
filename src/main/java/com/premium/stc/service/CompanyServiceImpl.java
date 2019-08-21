package com.premium.stc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.premium.stc.dao.*;
import com.premium.stc.model.Company;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	public Company insertCompany(Company company) throws Exception {
		return companyDao.save(company);
		
	}


	public Company updateCompany(Company company) throws Exception {
		return companyDao.saveAndFlush(company);
	
	}

	public List<Company> getCompanyList() throws Exception {
	
		return companyDao.findAll();
	}


	@Override
	public List<Company> getCompanyListSector(int sectorId) throws Exception {
		
		return companyDao.findBySectorId(sectorId);
	}

}

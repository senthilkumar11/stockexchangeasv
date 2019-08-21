package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.service.CompanyService;

@RestController
public class SectorRestController {

	@Autowired
	CompanyService companyService;
	
	@GetMapping("/companieslist")
	public List<Company> getCompaniesList() throws Exception
	{
		return companyService.getCompanyListSector(1);
		
	}
}


package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.premium.stc.model.Company;

public interface CompanyController {
	  public String insertCompany(Model model) throws Exception;
	    public Company updateCompany(Company company)throws Exception;
		public ModelAndView getCompanyList() throws Exception;
}

package com.web.entropy.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.web.entropy.backend.daos.AdminitratorDAO;

public class AdminitratorServiceAction implements AdminitratorService {
	@Autowired
	private AdminitratorDAO adminitratorDAO;

	@Transactional
	public boolean checkAdminitratorLogin(String adminitratorAccount, String adminitratorPassword) {
		return adminitratorDAO.checkAdminitratorLogin(adminitratorAccount, adminitratorPassword);
	}

}

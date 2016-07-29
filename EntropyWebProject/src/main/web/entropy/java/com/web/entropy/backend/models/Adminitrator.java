package com.web.entropy.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminitrator")
public class Adminitrator {
	@Id
	@GeneratedValue
	@Column(name = "adminitrator_id", length = 11)
	private int adminitratorId;
	@Column(name = "adminitrator_account")
	private String adminitratorAccount;
	@Column(name = "adminitrator_password")
	private String adminitratorPassword;

	public Adminitrator() {
		super();
	}

	public Adminitrator(int adminitratorId, String adminitratorAccount, String adminitratorPassword) {
		this.adminitratorId = adminitratorId;
		this.adminitratorAccount = adminitratorAccount;
		this.adminitratorPassword = adminitratorPassword;
	}

	public int getAdminitratorId() {
		return adminitratorId;
	}

	public void setAdminitratorId(int adminitratorId) {
		this.adminitratorId = adminitratorId;
	}

	public String getAdminitratorAccount() {
		return adminitratorAccount;
	}

	public void setAdminitratorAccount(String adminitratorAccount) {
		this.adminitratorAccount = adminitratorAccount;
	}

	public String getAdminitratorPassword() {
		return adminitratorPassword;
	}

	public void setAdminitratorPassword(String adminitratorPassword) {
		this.adminitratorPassword = adminitratorPassword;
	}

}

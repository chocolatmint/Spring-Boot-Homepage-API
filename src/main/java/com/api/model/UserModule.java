package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "UserModule")
public class UserModule implements java.io.Serializable {

	private int idUserModule;
	private UserData userData;
	private Modules modules;
	private int moduleOrder;

	public UserModule() {
	}

	public UserModule(int idUserModule, UserData userData, Modules modules,
			int moduleOrder) {
		this.idUserModule = idUserModule;
		this.userData = userData;
		this.modules = modules;
		this.moduleOrder = moduleOrder;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUserModule", unique = true, nullable = false)
	public int getIdUserModule() {
		return this.idUserModule;
	}

	public void setIdUserModule(int idUserModule) {
		this.idUserModule = idUserModule;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = false)
	public UserData getUserData() {
		return this.userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModule", nullable = false)
	public Modules getModules() {
		return this.modules;
	}

	public void setModules(Modules modules) {
		this.modules = modules;
	}

	@Column(name = "moduleOrder", nullable = false)
	public int getModuleOrder() {
		return this.moduleOrder;
	}

	public void setModuleOrder(int moduleOrder) {
		this.moduleOrder = moduleOrder;
	}

}

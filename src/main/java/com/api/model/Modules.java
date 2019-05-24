package com.api.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Modules")	
public class Modules implements java.io.Serializable {

	private int idModule;
	private String moduleName;
	private Set<UserModule> userModules = new HashSet(0);

	public Modules() {
	}

	public Modules(int idModule) {
		this.idModule = idModule;
	}

	public Modules(int idModule, String moduleName, Set userModules) {
		this.idModule = idModule;
		this.moduleName = moduleName;
		this.userModules = userModules;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idModule", unique = true, nullable = false)
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	@Column(name = "moduleName", length = 300)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modules")
	public Set<UserModule> getUserModules() {
		return this.userModules;
	}

	public void setUserModules(Set<UserModule> userModules) {
		this.userModules = userModules;
	}

}

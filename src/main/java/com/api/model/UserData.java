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

import com.api.service.UserModuleService;

@SuppressWarnings("serial")
@Entity
@Table(name = "UserData")
public class UserData implements java.io.Serializable {

	private int idUser;
	private String userName;
	private Set<UserModule> userModules = new HashSet(0);

	public UserData() {
	}

	public UserData(int idUser) {
		this.idUser = idUser;
	}

	public UserData(int idUser, String userName, Set userModules) {
		this.idUser = idUser;
		this.userName = userName;
		this.userModules = userModules;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "userName", length = 200)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userData")
	public Set<UserModule> getUserModules() {
		return this.userModules;
	}

	public void setUserModules(Set<UserModule> userModules) {
		this.userModules = userModules;
	}

}

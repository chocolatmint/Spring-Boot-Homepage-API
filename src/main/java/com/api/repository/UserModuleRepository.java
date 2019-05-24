package com.api.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.UserData;
import com.api.model.UserModule;

@Repository
public interface UserModuleRepository extends JpaRepository<UserModule, String> {
	
	public List<UserModule> findAllByUserData (UserData userData);
}

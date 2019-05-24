package com.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, String> {
	public UserData findByIdUser (int idUser);
}

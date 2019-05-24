package com.api.controller;
import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.exception.UserIdNotFoundException;
import com.api.exception.UserModuleNotFoundException;
import com.api.model.ModuleResponse;
import com.api.model.Modules;
import com.api.model.UserData;
import com.api.model.UserModule;
import com.api.model.UserModuleResponse;
import com.api.repository.UserDataRepository;
import com.api.repository.UserModuleRepository;

@RestController
@RequestMapping(value={"/api"})
public class ApiController {
	
	@Autowired
	UserModuleRepository userModule;
	
	@Autowired
	UserDataRepository userData;
	
	@RequestMapping(value={"/notes"})
	public String createNote() {
	    return "Maudy";
	}
	
	@RequestMapping(value={"/user/{idUser}"}, method=RequestMethod.GET)
	public UserModuleResponse getModuleById (@PathVariable(value = "idUser") int idUser){
		UserData user = userData.findByIdUser(idUser);
		if (user==null){
			throw new UserIdNotFoundException(idUser);
		}
		
		List<UserModule> modules = userModule.findAllByUserData(user);
		
		if (modules==null){
			throw new UserModuleNotFoundException(idUser);
		} 
		
		UserModuleResponse response = new UserModuleResponse();
		ModuleResponse [] arrModule = new ModuleResponse [modules.size()];
		for	(int i=0; i<modules.size(); i++){
			Modules module = modules.get(i).getModules();
			
			ModuleResponse moduleResponse = new ModuleResponse();
			moduleResponse.setModuleName(module.getModuleName());
			moduleResponse.setModuleOrder(modules.get(i).getModuleOrder());
			
			arrModule[i]=moduleResponse;
		}
		response.setModules(arrModule);
		return response;
	}
}

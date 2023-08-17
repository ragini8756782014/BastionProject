package com.example.demo.service;

import java.util.ArrayList;
import java. util.List;

import com.example.demo.entity.crmentity.DeveloperAccount;
import com.example.demo.repository.crmrepo.DeveloperAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.entity.crmentity.OnlineActivation;
import com.example.demo.entity.crmentity.User;
import com.example.demo.dto.BastionDto;
import com.example.demo.repository.crmrepo.OnlineActivationRepository;
import com.example.demo.repository.vendorrepo.OnlineLicenseRepository;
import com.example.demo.repository.crmrepo.UserInfoRepository;

@Service
public class BastionService {

	@Autowired
    private OnlineLicenseRepository onlineLicenseRepository ;
	
	@Autowired
	private OnlineActivationRepository onlineActivationRepository;
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private DeveloperAccountRepository developerAccountRepository;
	public List<BastionDto> getAll() {
		return onlineActivationRepository.fetchBastionDtoLeftJoin();
       }

	public void deleteEntry(String license_key){    
		onlineLicenseRepository.deleteById(onlineLicenseRepository.findSrNoByLicenseKeyValue(license_key));
		return ;
	}

  public String addUser(User user) {
	  user.setUser_password(passwordEncoder.encode(user.getUser_password()));
	  userInfoRepository.save(user);
	  return "user added to db ";
  }
	
  public OnlineActivation getById(String license_key){
	 return  onlineActivationRepository.getById(onlineActivationRepository.findSrNoByLicenseKeyValue(license_key));
  }

  public OnlineActivation updateSystemCount(String license_key){
	  OnlineActivation onlineActivation=  getById( license_key);
	  return onlineActivationRepository.save(onlineActivation);
  }

	private static List<DeveloperAccount> list=new ArrayList();

	static {

		list.add(new DeveloperAccount(12,"ragini@gamil.com","zxc",	"2023-05-01T15:23:45.123Z"));
		list.add(new DeveloperAccount(13,"rahul@gmail.com","asd","2023-05-01T15:23:45.123Z"));
		list.add(new DeveloperAccount(14,"rohan@gmail.com","uio","2023-05-01T15:23:45.123Z"));
	}

	public List<DeveloperAccount> getAlldeveloper()
	{
		return developerAccountRepository.findAll();
	}
}


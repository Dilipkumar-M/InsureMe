package com.staragile.insurance.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	

	@Autowired
	PolicyDAORepository policyDAORepository;

	//https://github.com/vilasvarghese/microservices/blob/master/training/day1/SpringBoot/4CompanyServiceImplementation.txt
	//continue from line : 115
	public List<Policy> getPolicies(){
		/*return Arrays.asList(
			new Policy("1", "DilipKumar", "Dilip address", "6453623445"),
			new Policy("2", "Shartanya", "Sharanya address", "9874563421"),
			new Policy("3", "Adi", "Adi address", "6542345661")
		);*/
		
		List<Policy> policyList = new ArrayList<Policy>();
		policyDAORepository.findAll().forEach(policyList::add);
		return policyList;
	}
	
	public Optional<Policy> getPolicy(String id) {
		return policyDAORepository.findById(id);
	}
	
	public void addPolicy(Policy policy) {
		policyDAORepository.save(policy);
	}
	
	public void updatePolicy(String id, Policy policy) {
		policyDAORepository.save(policy);
	}
	
	public void deletePolicy(String id) {
		policyDAORepository.deleteById(id);
	}
	
}

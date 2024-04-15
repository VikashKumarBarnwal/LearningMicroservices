/**
 * 
 */
package com.vks.microservice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vks.microservice.userservice.entity.Department;
import com.vks.microservice.userservice.entity.User;
import com.vks.microservice.userservice.model.UserWithDepartmentVO;
import com.vks.microservice.userservice.repository.UserRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

/**
 * @author Vikash
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository   userRepository;
	
	@Autowired
	RestTemplate    restTemplate;
	
	private static final String USER_SERVICE_CB = "userService";

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByUserid(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUserId(userId);
	}

	@Override
	public UserWithDepartmentVO getUserWithDepartmentVO(Long userId) {
		UserWithDepartmentVO obj = null;
		User user = userRepository.getUserByUserId(userId);
		if (user != null) {
		obj = new UserWithDepartmentVO();
		Department dept = getDepartment(user.getDepartmentId());
		obj.setDepartment(dept);
		obj.setUser(user);
		}
		
		return obj;
	}
	
	@CircuitBreaker(name = USER_SERVICE_CB ,fallbackMethod = "getDepartmentFalbackMethod")
	public Department getDepartment(Long  departmentId) {
		Department department =  null;
		String url = "http://DEPARTMENT-SERVICE/departments/" + departmentId;
		//String url = "http://localhost:9091/departments/" + departmentId;
	    department = restTemplate.getForObject(url, Department.class);
		return department;
	}
	
	
	public Department getDepartmentFalbackMethod(Long  departmentId, Exception ex) {
		System.out.println(ex.getMessage());
		Department department =  new Department();
		department.setDepartmentId(100l);
		department.setDepartmentName("Default Department");
		department.setDepartmentCode("100");
		department.setDepartmentAddress("DefaultAddress");
		return department;
		
	}

}

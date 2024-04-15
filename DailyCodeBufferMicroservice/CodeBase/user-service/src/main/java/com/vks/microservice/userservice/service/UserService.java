/**
 * 
 */
package com.vks.microservice.userservice.service;

import com.vks.microservice.userservice.entity.User;
import com.vks.microservice.userservice.model.UserWithDepartmentVO;

/**
 * @author Vikash
 *
 */
public interface UserService {


	User saveUser(User user);

	User getUserByUserid(Long userId);

	UserWithDepartmentVO getUserWithDepartmentVO(Long userId);
	


}


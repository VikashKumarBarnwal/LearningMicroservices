/**
 * 
 */
package com.vks.microservice.userservice.model;

import com.vks.microservice.userservice.entity.Department;
import com.vks.microservice.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vikash
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithDepartmentVO {
	User user;
	Department department;

}

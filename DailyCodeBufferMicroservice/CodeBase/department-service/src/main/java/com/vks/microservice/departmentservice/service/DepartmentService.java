/**
 * 
 */
package com.vks.microservice.departmentservice.service;

import com.vks.microservice.departmentservice.entity.Department;

/**
 * @author Vikash
 *
 */
public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findDepartmentById(Long departmentId);
	

}

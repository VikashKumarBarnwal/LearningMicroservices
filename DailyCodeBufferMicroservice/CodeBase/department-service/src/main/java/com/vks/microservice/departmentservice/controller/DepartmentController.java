/**
 * 
 */
package com.vks.microservice.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vks.microservice.departmentservice.entity.Department;
import com.vks.microservice.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Vikash
 *
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department department) {
		log.info("In side saveDepartment of DepartmentController ");
		
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
     public Department findDepartmentById(@PathVariable("id")  Long departmentId) {
	
	     log.info("In side findDepartmentById of DepartmentController ");
		
		return departmentService.findDepartmentById(departmentId);
		
	}

}

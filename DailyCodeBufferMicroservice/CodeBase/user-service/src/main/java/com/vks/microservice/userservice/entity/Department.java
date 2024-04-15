/**
 * 
 */
package com.vks.microservice.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Department {

	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
}

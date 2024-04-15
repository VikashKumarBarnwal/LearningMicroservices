/**
 * 
 */
package com.vks.microservice.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vikash
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	
	private String email;

	private Long  departmentId;
}

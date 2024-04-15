/**
 * 
 */
package com.vks.microservice.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vks.microservice.departmentservice.entity.Department;

/**
 * @author Vikash
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}

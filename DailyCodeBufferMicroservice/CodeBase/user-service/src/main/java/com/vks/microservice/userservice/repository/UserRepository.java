/**
 * 
 */
package com.vks.microservice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vks.microservice.userservice.entity.User;

/**
 * @author Vikash
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User getUserByUserId(Long userId);

}

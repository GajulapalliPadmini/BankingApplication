/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

/**
 * @author Nagesh
 *
 */
@Repository
public interface AccountRepo extends CrudRepository<Account, Long>{

	  public static Account findAccountById(long accountnumber) {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * 
 */
package com.weberp.app.dataaccessobjects;


import java.security.AccessControlException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Zvi
 *
 */
public abstract class DataAccessObject {
	
	private DataSource dataSource;

	private Permission permission;
	
	private JdbcTemplate jdbcTemplateObject;
	
	/**
	 * @param dataSource
	 * @param permission
	 */
	public DataAccessObject(DataSource dataSource, Permission permission) {
		super();
		this.setPermission(permission);
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}

		
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	
	/**
	 * @return the permission
	 */
	public Permission getPermission() {
		return permission;
	}


	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/**
	 * @param permission the permission to set
	 */
	public void setPermission(Permission permission) {
		if(permission == null) {
			throw new AccessControlException("User permission wasn't set");
		}
		if(!permission.hasPermission(this)) {
			System.out.println(this.getClass().getSimpleName());
			System.out.println(permission.getClass().getSimpleName());
			throw new AccessControlException("User has no access permission");
		}
		this.permission = permission;
	}


	/**
	 * @return the jdbcTemplateObject
	 */
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}



	
}

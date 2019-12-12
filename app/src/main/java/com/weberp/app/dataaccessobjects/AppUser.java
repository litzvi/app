/**
 * 
 */
package com.weberp.app.dataaccessobjects;

import java.util.Collections;
import java.util.Set;

import javax.security.auth.login.FailedLoginException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.weberp.app.AppConfig;
import com.weberp.app.dataobjects.mappers.UserMapper;

/**
 * @author Zvi
 *
 */
@Component
@Scope("singleton")
public class AppUser extends DataAccessObject implements Permission{
	
	private String username;
	
	private String role;
	
	private Set<String> privilegedClasses;
	
	
	/**
	 * 
	 */
	public AppUser(DataSource dataSource) {
		super(dataSource, new Permission (){
			public boolean hasPermission(Object serviceObj) {return true;}
			});
		privilegedClasses = Collections.emptySet();
	}

	
	/**
	 * @param username
	 * @param password
	 * @throws FailedLoginException 
	 */
	public void setUser(String username, String password) throws FailedLoginException {
		
		String sql = "SELECT * FROM users WHERE username = ? AND passward = ?";
		getJdbcTemplateObject().query(sql, new Object[]{username, password}, new UserMapper(this));
		
		if(role != null) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Permission.xml");
			privilegedClasses = context.getBean(role, Set.class);
		}		
	}
	
	//For testing only - should be removed.
	public void setUserDBA() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Permission.xml");
		privilegedClasses = context.getBean("DBA", Set.class);
	}
	
	

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @return
	 */
	public String getRole() {
		// TODO Auto-generated method stub
		return role;
	}


	/**
	 * @return the privilegedClasses
	 */
	public Set<String> getPrivilegedClasses() {
		return privilegedClasses;
	}


	/**
	 * @param privilegedClasses the privilegedClasses to set
	 */
	public void setPrivilegedClasses(Set<String> privilegedClasses) {
		this.privilegedClasses = privilegedClasses;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	public boolean hasPermission(Object serviceObj) {
		System.out.println(privilegedClasses);
		if(privilegedClasses.contains(serviceObj.getClass().getSimpleName())) {
			return true;
		}
		return false;
	}

}

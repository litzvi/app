/**
 * 
 */
package app;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dataaccessobjects.Permission;

/**
 * @author Zvi
 *
 */
@Configuration
@ComponentScan
public class AppConfig {
	
//	private Permission permission;
	
	private DataSource dataSource;
	
	/**
	 * 
	 */
	public AppConfig() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		this.dataSource = (DataSource)context.getBean("dataSource");
	}

	/**
	 * @return the permission
	 */
	/*
	 * @Bean public Permission getPermission() { return permission; }
	 */

	/**
	 * @param permission the permission to set
	 */
	/*
	 * public void setPermission(Permission permission) { this.permission =
	 * permission; }
	 */
	
	/**
	 * @return the dataSource
	 */
	@Bean
	public DataSource getDataSource() {
		return dataSource;
	}
}

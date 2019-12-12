/**
 * 
 */
package com.weberp.app.dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.weberp.app.dataaccessobjects.AppUser;

/**
 * @author Zvi
 *
 */
public class UserMapper implements ResultSetExtractor<AppUser> {
	
	private AppUser user;
	
	public UserMapper(AppUser user) {
		this.user = user;
	}

	public AppUser extractData(ResultSet rs) throws SQLException, DataAccessException {
		user.setUsername(rs.getString("username"));
		user.setRole(rs.getString("role"));
		return user;
	}

}

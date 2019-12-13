/**
 * 
 */
package com.weberp.app.dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.weberp.app.dataobjects.CompanyPosition;
import com.weberp.app.dataobjects.Country;

/**
 * @author Zvi
 *
 */
public class CompanyPositionsMapper implements RowMapper<CompanyPosition> {

	public CompanyPosition mapRow(ResultSet rs, int rowNum) throws SQLException {
		CompanyPosition position = new CompanyPosition();
		position.setId(rs.getInt("id"));
		position.setName(rs.getString("name"));
		
		return position;
	}

}

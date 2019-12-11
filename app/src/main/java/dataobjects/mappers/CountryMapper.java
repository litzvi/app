/**
 * 
 */
package dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dataobjects.Country;

/**
 * @author Zvi
 *
 */
public class CountryMapper implements RowMapper<Country> {

	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setId(rs.getInt("id"));
		country.setName(rs.getString("name"));
		
		return country;
	}

}

/**
 * 
 */
package com.weberp.app.dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.weberp.app.dataobjects.City;
import com.weberp.app.dataobjects.Country;

/**
 * @author Zvi
 *
 */
public class CityMapper implements RowMapper<City> {

	
	public City mapRow(ResultSet rs, int rowNum) throws SQLException {
		City city = new City();
		city.setId(rs.getInt("id"));
		city.setName(rs.getString("name"));
		city.setCountryID(rs.getInt("countryID"));
		
		return city;
	}

}

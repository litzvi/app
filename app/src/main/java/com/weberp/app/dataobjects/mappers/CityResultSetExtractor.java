/**
 * 
 */
package com.weberp.app.dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.weberp.app.dataobjects.City;

/**
 * @author Zvi
 *
 */
public class CityResultSetExtractor implements ResultSetExtractor<List<City>> {

	public List<City> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<City> list = new ArrayList<City>();  
        while(rs.next()){ 
        	City city = new City();
    		city.setId(rs.getInt("id"));
    		city.setName(rs.getString("name"));
    		city.setCountryID(rs.getInt("countryID"));
    		list.add(city);  
        }  
        return list;  
	}

}

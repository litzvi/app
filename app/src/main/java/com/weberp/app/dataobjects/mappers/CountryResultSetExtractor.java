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
import com.weberp.app.dataobjects.Country;


/**
 * @author Zvi
 *
 */
public class CountryResultSetExtractor implements ResultSetExtractor<List<Country>> {

	public List<Country> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Country> list = new ArrayList<Country>();  
        while(rs.next()){ 
        	Country country = new Country();
    		country.setId(rs.getInt("id"));
    		country.setName(rs.getString("name"));
    		list.add(country);  
        }  
        return list;  
	}

}

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
import com.weberp.app.dataobjects.SupplyCategory;


/**
 * @author Zvi
 *
 */
public class SupplyCategoryResultSetExtractor implements ResultSetExtractor<List<SupplyCategory>> {

	public List<SupplyCategory> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<SupplyCategory> list = new ArrayList<SupplyCategory>();  
        while(rs.next()){ 
        	SupplyCategory category = new SupplyCategory();
    		category.setId(rs.getInt("id"));
    		category.setName(rs.getString("name"));
    		list.add(category);  
        }  
        return list; 
	}

}

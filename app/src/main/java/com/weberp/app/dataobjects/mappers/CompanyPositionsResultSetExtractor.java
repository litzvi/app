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

import com.weberp.app.dataobjects.CompanyPosition;

/**
 * @author Zvi
 *
 */
public class CompanyPositionsResultSetExtractor implements ResultSetExtractor<List<CompanyPosition>> {

	public List<CompanyPosition> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<CompanyPosition> list = new ArrayList<CompanyPosition>();  
        while(rs.next()){ 
        	CompanyPosition position = new CompanyPosition();
    		position.setId(rs.getInt("id"));
    		position.setName(rs.getString("name"));
    		list.add(position);  
        }  
        return list;  
	}

}

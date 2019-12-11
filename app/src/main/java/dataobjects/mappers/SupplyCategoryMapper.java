/**
 * 
 */
package dataobjects.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dataobjects.SupplyCategory;

/**
 * @author Zvi
 * @param <T>
 *
 */
public class SupplyCategoryMapper implements RowMapper<SupplyCategory> {

	public SupplyCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
		SupplyCategory category = new SupplyCategory();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		
		return category;
	}

}

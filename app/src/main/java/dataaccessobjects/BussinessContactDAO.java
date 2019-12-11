/**
 * 
 */
package dataaccessobjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dataaccessobjects.services.PreparedStatementCreatorImpl;
import dataobjects.City;
import dataobjects.Company;
import dataobjects.Country;
import dataobjects.Supplier;
import dataobjects.SupplyCategory;
import dataobjects.mappers.CityMapper;
import dataobjects.mappers.CountryMapper;
import dataobjects.mappers.SupplyCategoryMapper;

/**
 * @author Zvi
 *
 */
@Component
@Scope("prototype")
public class BussinessContactDAO extends DataAccessObject {

		
	/**
	 * @param dataSource
	 * @param permission
	 */
	public BussinessContactDAO(DataSource dataSource, Permission permission) {
		super(dataSource, permission);
	}

	@Transactional
	public boolean addSupplier(final Supplier supplier) {
		
		final int companyID = addCompany(supplier.getCompany());
		
		String sql = "insert into suppliers (companyID, name) values (?, ?)";
		getJdbcTemplateObject().update(sql, new Object[] {companyID, supplier.getName()});
		
		sql = "insert into category_supplier (companyID, categoryID) values (?, ?)";
		getJdbcTemplateObject().batchUpdate(sql, 
				new BatchPreparedStatementSetter() {
		            public void setValues(PreparedStatement ps, int i) throws SQLException {
		                ps.setInt(1, companyID);
		                ps.setInt(2, supplier.getCategories()[i].getId());
		            }
		
		            public int getBatchSize() {
		                return supplier.getCategories().length;
		            }
        		});
				
		return true;	
	}

	/**
	 * @param company
	 */
	public int addCompany(final Company company) {
		
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		String sql = "insert into company (legalInfo, contactDetails) values (?, ?)";
		Object[] parameters = new Object[] {company.getLegelInfo(), company.getContactInfo()};
		PreparedStatementCreator psc = new PreparedStatementCreatorImpl(sql, parameters, new String[] {"id"});
		
		getJdbcTemplateObject().update(psc, keyHolder);
		
		return keyHolder.getKey().intValue();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Country> getCountries() {
		return getJdbcTemplateObject().query("selct * from countries", new CountryMapper());
	}
	
	/**
	 * 
	 * @return
	 */
	public List<City> getCities() {
		return getJdbcTemplateObject().query("selct * from cities", new CityMapper());
	}
	
	
	/**
	 * 
	 * @return
	 */
	public List<SupplyCategory> getSupplyCategories() {
		return getJdbcTemplateObject().query("selct * from supply_category", new SupplyCategoryMapper());
	}
	
}

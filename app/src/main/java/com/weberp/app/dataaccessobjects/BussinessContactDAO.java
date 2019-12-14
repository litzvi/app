/**
 * 
 */
package com.weberp.app.dataaccessobjects;

import java.io.UncheckedIOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.weberp.app.dataaccessobjects.services.PreparedStatementCreatorImpl;
import com.weberp.app.dataobjects.City;
import com.weberp.app.dataobjects.Company;
import com.weberp.app.dataobjects.CompanyPosition;
import com.weberp.app.dataobjects.Country;
import com.weberp.app.dataobjects.Supplier;
import com.weberp.app.dataobjects.SupplierEmptyForm;
import com.weberp.app.dataobjects.SupplyCategory;
import com.weberp.app.dataobjects.mappers.CityMapper;
import com.weberp.app.dataobjects.mappers.CityResultSetExtractor;
import com.weberp.app.dataobjects.mappers.CountryMapper;
import com.weberp.app.dataobjects.mappers.CountryResultSetExtractor;
import com.weberp.app.dataobjects.mappers.CompanyPositionsMapper;
import com.weberp.app.dataobjects.mappers.CompanyPositionsResultSetExtractor;

import com.weberp.app.dataobjects.mappers.SupplyCategoryMapper;
import com.weberp.app.dataobjects.mappers.SupplyCategoryResultSetExtractor;

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
	
	public SupplierEmptyForm getSupplierEmptyForm() {
		return getJdbcTemplateObject().execute(
				new CallableStatementCreator() {
			
					public CallableStatement createCallableStatement(Connection con) throws SQLException {
						return con.prepareCall("{ CALL SupplierEmptyForm() }");
					}
				}, 
				new CallableStatementCallback<SupplierEmptyForm>() {

					public SupplierEmptyForm doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
						SupplierEmptyForm supplierEmptyForm = new SupplierEmptyForm();
						ResultSet rs = cs.executeQuery();
						if(rs == null) {
							throw new DataRetrievalFailureException("Couldn't fetch supplier form dropdown information");
						}
						boolean hasRS = true;
						while(hasRS) {
							String tableName = rs.getMetaData().getTableName(1);
							if(tableName.equals("countries")) {
								supplierEmptyForm.setCountries(new CountryResultSetExtractor().extractData(rs));
							}
							else if(tableName.equals("cities")) {
								supplierEmptyForm.setCities(new CityResultSetExtractor().extractData(rs));
							}
							else if(tableName.equals("supply_category")) {
								supplierEmptyForm.setCategories(new SupplyCategoryResultSetExtractor().extractData(rs));
							}
							else if(tableName.equals("company_positions")) {
								supplierEmptyForm.setPositions(new CompanyPositionsResultSetExtractor().extractData(rs));
							}
							else {
								throw new DataRetrievalFailureException("Stored Procedure returned unexpected results");
							}
							
							if(cs.getMoreResults()) {
								rs = cs.getResultSet();
							}
							else {
								hasRS = false;
							}
						}
	
						
						return supplierEmptyForm;
					}
				
				}
			);
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Country> getCountries() {
		return getJdbcTemplateObject().query("select * from countries", new CountryResultSetExtractor());
	}
	
	/**
	 * 
	 * @return
	 */
	public List<City> getCities() {
		return getJdbcTemplateObject().query("select * from cities", new CityResultSetExtractor());
	}
	
	
	/**
	 * 
	 * @return
	 */
	public List<SupplyCategory> getSupplyCategories() {
		return getJdbcTemplateObject().query("select * from supply_category", new SupplyCategoryResultSetExtractor());
	}
	
	/**
	 * 
	 * @return
	 */
	public List<CompanyPosition> getPositions() {
		return getJdbcTemplateObject().query("select * from company_positions", new CompanyPositionsResultSetExtractor());
	}
	
}

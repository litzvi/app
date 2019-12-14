package com.weberp.app.webservice;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.gson.Gson;
import com.weberp.app.dataaccessobjects.AppUser;
import com.weberp.app.dataaccessobjects.BussinessContactDAO;
import com.weberp.app.dataobjects.City;
import com.weberp.app.dataobjects.CompanyPosition;
import com.weberp.app.dataobjects.Country;
import com.weberp.app.dataobjects.Order;
import com.weberp.app.dataobjects.Position;
import com.weberp.app.dataobjects.Supplier;
import com.weberp.app.dataobjects.SupplyCategory;





@Path("/getset")
public class GeteerSetter {
	
	@Autowired DataSource ds;

	BussinessContactDAO dao;
	public GeteerSetter() {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.weberp.app");
		AppUser user = context.getBean("appUser", AppUser.class);
		user.setUserDBA();
		dao = context.getBean("bussinessContactDAO", BussinessContactDAO.class);
	}
	
	@GET
	@Path("/suplliersetup")
	@Produces("application/json")
	public String getSetup() {
		List<Object> result = new ArrayList<Object>();
		List<City> cityholder = dao.getCities();
		result.add(cityholder);
		List<Country> countryholder = dao.getCountries();
		result.add(countryholder);
		List<SupplyCategory> Supplyholder = dao.getSupplyCategories();
		result.add(Supplyholder);
		List<CompanyPosition> Positionholder = dao.getPositions();
		result.add(Positionholder);  
		return new Gson().toJson(result);
	}
	
	@POST
	@Path("/addsupllier")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addSupplier(String product) {
		System.out.println(product);
		Supplier bean = new Gson().fromJson(product, Supplier.class); 
		System.out.println(bean);
		dao.addSupplier(bean);
		return Response.status(201).build();
	}
	
	@GET
	@Path("/{id}/getsupllier")
	@Produces("application/json")
	public String getSupplier(@PathParam("id") int id) {
		Supplier bean = new Supplier();
		System.out.println("mmm"+bean);
		return new Gson().toJson(bean);
	}
	
	@POST
	@Path("/addorder")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addOrder(String product){
		Order bean = new Gson().fromJson(product, Order.class); 
		System.out.println(bean);
		return Response.status(201).build();
	}
	
	@GET
	@Path("/getorder")
	@Produces("application/json")
	public String getOrder() {
		Order bean = new Order();
		return new Gson().toJson(bean);
	}

}

package com.weberp.app.webservice;


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
import com.weberp.app.dataobjects.Country;
import com.weberp.app.dataobjects.Order;
import com.weberp.app.dataobjects.Position;
import com.weberp.app.dataobjects.Supplier;
import com.weberp.app.dataobjects.SupplyCategory;





@Path("/getset")
public class GeteerSetter {
	
	@Autowired DataSource ds;

	public GeteerSetter() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Path("/suplliersetup")
	@Produces("application/json")
	public String getSetup() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.weberp.app");
		AppUser user = context.getBean("appUser", AppUser.class);
		user.setUserDBA();
		BussinessContactDAO dao = context.getBean("bussinessContactDAO", BussinessContactDAO.class);
		
		City[] cityholder = (new City()).getAll();
		Country[] countryholder = (new Country()).getAll();
		SupplyCategory[] Supplyholder = (new SupplyCategory()).getAll();
		Position[] Positionholder = (new Position()).getAll();
	      

	      
		return new Gson().toJson(cityholder);
	}
	
	@POST
	@Path("/addsupllier")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addSupplier(String product) {
		System.out.println(product);
		Supplier bean = new Gson().fromJson(product, Supplier.class); 
		System.out.println(bean);
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

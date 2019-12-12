package com.weberp.app.webservice;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig; 

@ApplicationPath("/")
public class GetAppliction extends ResourceConfig{

	public GetAppliction() {
		packages("com.weberp.app.webservice");
	}

}





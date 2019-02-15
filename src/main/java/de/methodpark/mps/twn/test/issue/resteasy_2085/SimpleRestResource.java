package de.methodpark.mps.twn.test.issue.resteasy_2085;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/simple")
public class SimpleRestResource {

	
	
	@Path("/date")
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	@Consumes({MediaType.TEXT_PLAIN})
	public String getDate() {
		return "Today is "+ new Date();
	}
	
	
}

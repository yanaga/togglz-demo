package com.redhat.developers.togglz;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;

@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public String doGet() throws MalformedURLException {
		if (ApplicationFeatureToggle.HELLO.isActive()) {
			return "Hello";
		} else {
			return "Ola";
		}
	}

}
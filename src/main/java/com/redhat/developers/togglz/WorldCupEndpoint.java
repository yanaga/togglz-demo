package com.redhat.developers.togglz;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.net.MalformedURLException;

@ApplicationScoped
@Path("/worldcup")
public class WorldCupEndpoint {

    @GET
    @Produces("application/json")
    public String[] doGet() {
        return WorldCupFavorites.FAVORITES;
    }

}
package com.github.dirkraft.dm.ui;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;


/**
 * @author Jason Dunkelberger (dirkraft)
 */
@Path("/")
public class WelcomeWeb {

    @GET
    public Response defaultPage() throws URISyntaxException {
        return Response.status(Response.Status.MOVED_PERMANENTLY).location(new URI("/edit.html")).build();
    }

}

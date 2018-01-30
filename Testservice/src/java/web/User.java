/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author niemi
 */
@Path("test")
public class User {
    /**
     * Creates a new instance of User
     */
    public User() {
    }

    /**
     * Retrieves representation of an instance of web.User
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "Hello you call our REST webservice through HTTP GET";
    }
    @GET
    @Path("/{num}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTextPath(@PathParam("num")int num){
        return "Hello you call our REST webservice through HTTP GET WITH sub path "+num;
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postText(){
        return "This is HTTP POST";
    }
    @POST
    @Path("sub")
    @Produces(MediaType.TEXT_PLAIN)
    public String postTextParam(@FormParam("num")int num){
        return "This is HTTP POST "+num;
    }

    /**
     * PUT method for updating or creating an instance of User
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}

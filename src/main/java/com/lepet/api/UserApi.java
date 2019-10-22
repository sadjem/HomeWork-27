package com.lepet.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lepet.dao.UserDao;
import com.lepet.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public class UserApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAll(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<User> users = UserDao.getInstance().getAll();
        String json = gson.toJson(users);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public Response addUser (@FormParam("name") String name,
                             @FormParam("age") int age,
                             @FormParam("street")String street,
                             @FormParam("houseNumber") int houseNumber){
        UserDao.getInstance().addUser(new User(name, age, street,houseNumber));
        return Response
                .status(Response.Status.OK)
                .entity("User created")
                .build();
    }
}

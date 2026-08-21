package com.raj.demoRest;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepository ar = new AlienRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAliens() {
		System.out.println("MultiCall");
		return ar.getAliens();
	}
	
	@GET
	@Path("alien/{num}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("num") int id) {
		System.out.println("Single call");

		return ar.getAlien(id);
	}

	@POST
	@Path("alien")
	public Alien CreateAlien(Alien a1) {
		System.out.println(a1);
		ar.create(a1);
		return a1;
	}

}

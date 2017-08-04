package io.robusta.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotAcceptableException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.robusta.ForaDataSource;
import io.robusta.business.UserBusiness;
import io.robusta.demo.providers.NotAcceptableCustomException;
import io.robusta.domain.User;

@Path("users")
@Produces("application/json")
@Consumes("application/json")
public class UserResource {
	

	@Path("test")
	@GET
	public String test() {
		return "test";
	}

	/*
	 * @GET public String helloAdmin(@QueryParam("admin") boolean isAdmin) {
	 * return "isAdmin ? " + isAdmin; }
	 */

	@GET
	public Response findUsers(@QueryParam("admin") String isAdmin) throws Exception {

		List<User> listAdmins = new ArrayList<>();

		for (User user : ForaDataSource.getInstance().getUsers()) {
			if (isAdmin == null) {
				listAdmins.add(user);

			} else {
				switch (isAdmin) {
				case "true":
					if (user.isAdmin())
						listAdmins.add(user);
					break;
				case "false":
					if (!user.isAdmin())
						listAdmins.add(user);
					break;

				default:
					throw new NotAcceptableCustomException("Paramater admin must be true or false");
					
					//return Response.status(406).entity("Paramater admin must be true or false").build();
					
				}

			}
		}

		return Response.ok(listAdmins).build();
	}

	// return ForaDataSource.getInstance().getUsers();

	/*
	 * public List<User> findUsers(@QueryParam("admin") Boolean isAdmin) throws
	 * Exception {
	 * 
	 * List<User> listAdmins = new ArrayList<>();
	 * 
	 * for (User user : ForaDataSource.getInstance().getUsers()) { if (isAdmin
	 * == null) { listAdmins.add(user); } else if (user.isAdmin() == isAdmin) {
	 * listAdmins.add(user); }
	 * 
	 * }
	 * 
	 * 
	 * return listAdmins;
	 * 
	 */
	// }

	/*
	 * @GET
	 * 
	 * @Produces("application/json") public User findUsersById(@QueryParam("id")
	 * Long id) throws Exception {
	 * 
	 * return new UserBusiness().findById(id);
	 * 
	 * }
	 */

	@GET
	@Produces("application/json")
	@Path("{id}") // le chemin est flora/users/id alors que le premier get a une
					// route différente flora/users tout court
	public User findUsersById(@PathParam("id") Long id) throws Exception {
		User user = new UserBusiness().findById(id);
		if (user == null) {
			throw new io.robusta.demo.providers.NotFoundException("No user " + id + " found");
		}
		return user;
	}
}
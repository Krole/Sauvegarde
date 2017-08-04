package io.robusta.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.robusta.business.CommentBusiness;
import io.robusta.domain.Comment;

@Path("comments")
@Consumes("application/json")
@Produces("application/json")

public class CommentResource {

	@PUT
	@Path("{idComment}/up")
	public int getUpScore(@PathParam("idComment") String idComment) {		
		Comment comment = new CommentBusiness().getCommentById(idComment);
		comment.up();
		return comment.getScore();
	}
	
	@PUT
	@Path("{idComment}/down")
	public int getDownScore(@PathParam("idComment") String idComment) {	
		Comment comment = new CommentBusiness().getCommentById(idComment);
		comment.down();
		return comment.getScore();
	}
	

	
	
	
	
}

package com.coffreo.cours.commentaires.service;


import com.coffreo.cours.commentaires.model.Commentaire;
import com.coffreo.cours.commentaires.model.Message;
import com.coffreo.cours.commentaires.model.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Path("/commentaire-service")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class CommentaireServiceImpl implements CommentaireService {

    private static Map<String, Commentaire> list_comments = new ConcurrentHashMap<>();

    @Override
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response create(Commentaire comment) {
        Response response = new Response();
        response.setSuccess(false);

        // Check comment has an ID
        if (null == comment.getId()){
            response.setMessage(Message.MESSAGE_CREATION_NO_COMMENT_ID);
        }
        // Check comment doesn't already exist
        else if(list_comments.get(comment.getId()) != null){
            response.setMessage(Message.MESSAGE_CREATION_COMMENT_ID_ALREADY_USED);
        }
        // ELSE: valid creation
        else{
            list_comments.put(comment.getId(), comment);
            response.setSuccess(true);
            response.setMessage(Message.MESSAGE_CREATE_SUCCESS);
        }
        return response;
    }

    @Override
    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Response delete(@PathParam("id") String id) {
        // Get comment from ID
        Commentaire comment = list_comments.get(id);

        // Create response
        Response response = new Response();
        response.setSuccess(null != comment);

        // Comment found
        if(response.isSuccess()){
            // Delete comment
            list_comments.remove(id);
            // Update response
            response.setSuccess(true);
            response.setMessage(Message.MESSAGE_DELETE_SUCCESS);
        }
        // Comment no found
        else{
            // Update response
            response.setMessage(Message.MESSAGE_COMMENT_NOT_FOUND);
        }

        return response;
    }

    @Override
    @PUT
    @Path("/update/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response update(@PathParam("id") String id, Commentaire comment) {
        // Init Response
        Response response = new Response();
        response.setSuccess(false);

        // Check new comment has an ID
        if (null == comment.getId() || comment.getId().isEmpty()){
            response.setMessage(Message.MESSAGE_UPDATE_NO_ID_IN_NEW);
        }
        // No Comment found to update (invalid ID)
        else if (null == list_comments.get(id)){
            response.setMessage(Message.MESSAGE_COMMENT_NOT_FOUND);
        }
        // Valid update
        else {
            // Delete existing
            list_comments.remove(id);
            // Create new comment
            list_comments.put(comment.getId(), comment);

            // Update response
            response.setMessage(Message.MESSAGE_UPDATE_SUCCESS);
            response.setSuccess(true);
        }

        return response;
    }

    @Override
    @GET
    @Path("/read/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Commentaire read(@PathParam("id") String id) {
        return list_comments.get(id);
    }

    @Override
    @GET
    @Path("/read-all")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Commentaire> readAll() {
        // ArrayList OutPut
        ArrayList<Commentaire> comments = new ArrayList<>();
        // Add each comment in arrayList output
        for (String key: list_comments.keySet()) {
            comments.add(list_comments.get(key));
        }

        return comments;
    }

    @Override
    @GET
    @Path("/delete/all")
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteAll() {
        list_comments = new HashMap<>();

        Response response = new Response();
        response.setSuccess(true);
        response.setMessage(Message.MESSAGE_DELETE_ALL_SUCCESS);
        return response;
    }
}

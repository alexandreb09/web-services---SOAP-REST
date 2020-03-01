package com.coffreo.cours.commentaires.service;


import com.coffreo.cours.commentaires.model.*;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(serviceName = "CommentaireService")
public class CommentaireServiceImplementation implements CommentaireService{
    public ArrayList<Commentaire> list_comments;

    public CommentaireServiceImplementation(){
        list_comments = new ArrayList<>();
    }

    /**
     * Create a new comment:
     *      - Check a comment is provided
     *      - Check the provided comment has an ID
     *
     * @param comment (Commentaire): new comment
     * @return CreateResponse
     */
    @Override
    public Response create(@WebParam(name="commentaire") Commentaire comment) throws CommentaireException {
        // Check a comment is provided
        if (comment == null){
            throw new CommentaireException(CommentaireException.MESSAGE_CREATION_NO_COMMENT);
        }else
            // Check comment ID isn't null
            if (comment.getId() == null){
            throw new CommentaireException(CommentaireException.MESSAGE_CREATION_NO_COMMENT_ID);
        }
        // Check there is no already existing comment with this ID
        if (-1 != Utils.getIndexCommentFromId(list_comments, Integer.toString(comment.getId()))){
            throw new CommentaireException(CommentaireException.MESSAGE_CREATION_COMMENT_ID_ALREADY_USED);
        }

        // add comment
        list_comments.add(comment);

        return (new CreateResponse()).getReturn();
    }

    /**
     * Delete a comment from a given ID:
     *      - check the provided ID is not null
     *      - ckeck a comment is provided
     *      - check the provided comment has an ID
     *      - check the comment to update already exists
     *
     * @param id (string): id of the comment to delete
     * @param new_comment (Commentaire): new comment
     * @return UpdateResponse if success - "not found exception" if comment not found
     */
    @Override
    public Response update(@WebParam(name="id") String id,
                           @WebParam(name="nouveau_commentaire") Commentaire new_comment) throws CommentaireException {
        // Check id is provided
        if (id == null || "".equals(id)){
            throw new CommentaireException(CommentaireException.MESSAGE_UPDATE_NO_ID);
        }
        // Check comment is provided
        if (new_comment == null){
            throw new CommentaireException(CommentaireException.MESSAGE_UPDATE_NO_COMMENT);
        }else
            // Check new comment has an id
            if(new_comment.getId() == null){
            throw new CommentaireException(CommentaireException.MESSAGE_UPDATE_NO_ID_IN_NEW);
        }

        // Get index of the provided comment
        int index = Utils.getIndexCommentFromId(list_comments, id);

        // If comment not found
        if (index == -1){
            throw new CommentaireException(CommentaireException.MESSAGE_COMMENT_NOT_FOUND);
        }

        // Update the content
        list_comments.set(index, new_comment);

        return (new UpdateResponse()).getReturn();
    }


    /**
     * Delete a comment from a given ID:
     *      - check an ID is provided
     *      - check the comment to delete already exists
     *
     * @param id (string): id of the comment to delete
     * @return DeleteResponse if success - "not found exception" if comment not found
     */
    @Override
    public Response delete(@WebParam(name="id") String id) throws CommentaireException {
        // Check id isn't null or empty string
        if (id == null || "".equals(id)){
            throw new CommentaireException(CommentaireException.MESSAGE_DELETE_NO_ID);
        }

        // Find the comment from read function
        Commentaire comment = read(id);

        // If comment is null <=> no comment found : raise error
        if (comment == null){
            throw new CommentaireException(CommentaireException.MESSAGE_COMMENT_NOT_FOUND);
        }

        // If comment found : delete the comment
        list_comments.remove(comment);

        return (new DeleteResponse()).getReturn();
    }

    /**
     * Read a comment from a given ID:
     *      - check ID is provided
     *      - check the comment exists
     *
     * @param id (string): id of the comment to read
     * @return comment if found - "not found exception" if not found
     */
    @Override
    public Commentaire read(@WebParam(name="id") String id) throws CommentaireException {
        // Check id isn't null or empty string
        if (id == null || "".equals(id)){
            throw new CommentaireException(CommentaireException.MESSAGE_READ_NO_ID);
        }

        // Search comment with the given ID
        int index = Utils.getIndexCommentFromId(list_comments, id);

        // Raise error if comment not found
        if (-1 == index){
            throw new CommentaireException(CommentaireException.MESSAGE_COMMENT_NOT_FOUND);
        }

        // return comment
        return list_comments.get(index);
    }

    /**
     * Read all the comments currently stored
     * No checks
     *
     * @return String definition of all comments:
     */
    @Override
    public String readAll() {
        // Number of comments saved
        int size = list_comments.size();

        // If no comment
        if (size == 0){
            return "There is no comments saved -_-";
        }

        // Else: if there are comments
        String rep = "There are " + size + " comments: \n\t";
        // If there is one comment
        if (size == 1){
            rep = "There is " + size + " comment: \n\t";
        }
        StringBuilder repBuilder = new StringBuilder(rep);
        for (Commentaire commentaire: list_comments) {
            repBuilder.append(commentaire).append("\n\t");
        }
        return repBuilder.toString();
    }

    /**
     * Delete all comments
     * Used for tests cleaning before running
     */
    public void deleteAllComments(){
        list_comments = new ArrayList<>();
    }
}

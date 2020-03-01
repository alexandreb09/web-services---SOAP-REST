package com.coffreo.cours.commentaires.service;

public class CommentaireException extends Exception {
    public static final String MESSAGE_CREATION_NO_COMMENT      = "A comment is required for creation";
    public static final String MESSAGE_CREATION_NO_COMMENT_ID   = "A comment ID is required for creation";
    public static final String MESSAGE_CREATION_COMMENT_ID_ALREADY_USED = "A comment already exist for this ID, please select another ID";
    public static final String MESSAGE_UPDATE_NO_ID             = "ID of the comment to update is required";
    public static final String MESSAGE_UPDATE_NO_COMMENT        = "A comment is required for update";
    public static final String MESSAGE_UPDATE_NO_ID_IN_NEW      = "ID in the new comment is required";
    public static final String MESSAGE_READ_NO_ID               = "ID is required to find a comment";
    public static final String MESSAGE_DELETE_NO_ID             = "ID is required to delete a comment";
    public static final String MESSAGE_COMMENT_NOT_FOUND        = "ID doesn't match any comments";

    public CommentaireException(String message){
        super(message, new IllegalArgumentException("Invalid arguments"));
    }
}

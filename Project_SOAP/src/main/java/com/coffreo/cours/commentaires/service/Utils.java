package com.coffreo.cours.commentaires.service;

import com.coffreo.cours.commentaires.model.Commentaire;
import com.sun.istack.NotNull;

import java.util.ArrayList;

/* ************************************ */
/* Utils functions                      */
/* ************************************ */
public class Utils {
    /**
     * Return the index of the provided comment_id in the list of comments
     * If not found, return -1
     *
     * @param id (String): id to found
     * @return index: integer
     */
    public static int getIndexCommentFromId(@NotNull ArrayList<Commentaire> list_comments, String id){
        int index = -1;
        for (Commentaire com: list_comments) {
            index++;
            if (Integer.toString(com.getId()).equals(id)){
                return index;
            }
        }
        return -1;
    }
}

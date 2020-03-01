package com.coffreo.cours.commentaires.service;

import com.coffreo.cours.commentaires.model.Commentaire;
import com.coffreo.cours.commentaires.model.Response;

import java.util.ArrayList;

public interface CommentaireService {

    public Response create(Commentaire p);

    public Response delete(String id);

    public Response update(String id, Commentaire commentaire);

    public Commentaire read(String id);

    public ArrayList<Commentaire> readAll();

    public Response deleteAll();
}

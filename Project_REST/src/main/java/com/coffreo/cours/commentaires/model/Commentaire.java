package com.coffreo.cours.commentaires.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name="commentaire")
public class Commentaire {

    protected String auteur;
    protected XMLGregorianCalendar dateCreation;
    protected String id;
    protected String titre;

    @Override
    public String toString(){
        return id + "¤" + auteur + "¤" + dateCreation + "¤" + titre;
    }

    /* ************************************ */
    /* GETTER AND SETTER                    */
    /* ************************************ */
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(XMLGregorianCalendar dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}


package com.coffreo.cours.commentaires.service;

import com.coffreo.cours.commentaires.model.Response;
import com.coffreo.cours.commentaires.model.Commentaire;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(serviceName = "CommentaireService",
        name = "CommentaireService",
        targetNamespace = "http://commentaires.cours.coffreo.com/")
public interface CommentaireService {

    /**
     *
     * @param id: id comment
     * @param content: new content
     * @return
     *     returns com.coffreo.cours.commentaires.rest.Commentaire.entity.Response
     */
    @WebMethod
    @WebResult
    @RequestWrapper(localName = "update", targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.UpdateResponse")
    @Action(input = "http://commentaires.cours.coffreo.com/CommentaireService/updateRequest",
            output = "http://commentaires.cours.coffreo.com/CommentaireService/updateResponse")
    Response update(
            @WebParam(name = "id") String id,
            @WebParam(name = "content") Commentaire content) throws CommentaireException;

    /**
     * @param id: id comment
     * @return returns com.coffreo.cours.commentaires.rest.Commentaire.entity.Commentaire
     */
    @WebMethod
    @WebResult
    @RequestWrapper(localName = "read",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.Read")
    @ResponseWrapper(localName = "readResponse",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.ReadResponse")
    @Action(input = "http://commentaires.cours.coffreo.com/CommentaireService/readRequest",
            output = "http://commentaires.cours.coffreo.com/CommentaireService/readResponse")
    Commentaire read(@WebParam(name = "id") String id) throws CommentaireException;

    /**
     * @param id: id comment
     * @return
     *     returns com.coffreo.cours.commentaires.rest.Commentaire.entity.Response
     */
    @WebMethod
    @WebResult
    @RequestWrapper(localName = "delete",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.Delete")
    @ResponseWrapper(localName = "deleteResponse",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.DeleteResponse")
    @Action(input = "http://commentaires.cours.coffreo.com/CommentaireService/deleteRequest",
            output = "http://commentaires.cours.coffreo.com/CommentaireService/deleteResponse")
    Response delete(@WebParam(name = "id") String id) throws CommentaireException;

    /**
     * @param commentaire: id comment
     * @return returns com.coffreo.cours.commentaires.rest.Commentaire.entity.Response
     */
    @WebMethod
    @WebResult
    @RequestWrapper(localName = "create",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.Create")
    @ResponseWrapper(localName = "createResponse",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.CreateResponse")
    @Action(input = "http://commentaires.cours.coffreo.com/CommentaireService/createRequest",
            output = "http://commentaires.cours.coffreo.com/CommentaireService/createResponse")
    Response create(@WebParam(name = "Commentaire") Commentaire commentaire) throws CommentaireException;

    /**
     * @return returns java.lang.String
     */
    @WebMethod
    @RequestWrapper(localName = "readAll",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.ReadAll")
    @ResponseWrapper(localName = "readAllResponse",
            targetNamespace = "http://commentaires.cours.coffreo.com/",
            className = "com.coffreo.cours.commentaires.rest.Commentaire.entity.ReadAllResponse")
    @Action(input = "http://commentaires.cours.coffreo.com/CommentaireService/readAllRequest",
            output = "http://commentaires.cours.coffreo.com/CommentaireService/readAllResponse")
    String readAll();
}

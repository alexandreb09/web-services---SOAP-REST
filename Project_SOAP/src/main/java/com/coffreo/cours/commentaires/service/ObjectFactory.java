
package com.coffreo.cours.commentaires.service;

import com.coffreo.cours.commentaires.model.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coffreo.cours.commentaires package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Create_QNAME = new QName("http://commentaires.cours.coffreo.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://commentaires.cours.coffreo.com/", "createResponse");
    private final static QName _Update_QNAME = new QName("http://commentaires.cours.coffreo.com/", "update");
    private final static QName _Commentaire_QNAME = new QName("http://commentaires.cours.coffreo.com/", "commentaire");
    private final static QName _Delete_QNAME = new QName("http://commentaires.cours.coffreo.com/", "delete");
    private final static QName _ReadAll_QNAME = new QName("http://commentaires.cours.coffreo.com/", "readAll");
    private final static QName _UpdateResponse_QNAME = new QName("http://commentaires.cours.coffreo.com/", "updateResponse");
    private final static QName _ReadAllResponse_QNAME = new QName("http://commentaires.cours.coffreo.com/", "readAllResponse");
    private final static QName _ReadResponse_QNAME = new QName("http://commentaires.cours.coffreo.com/", "readResponse");
    private final static QName _Read_QNAME = new QName("http://commentaires.cours.coffreo.com/", "read");
    private final static QName _DeleteResponse_QNAME = new QName("http://commentaires.cours.coffreo.com/", "deleteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coffreo.cours.commentaires
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadAllResponse }
     * 
     */
    public ReadAllResponse createReadAllResponse() {
        return new ReadAllResponse();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Commentaire }
     * 
     */
    public Commentaire createCommentaire() {
        return new Commentaire();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link ReadAll }
     * 
     */
    public ReadAll createReadAll() {
        return new ReadAll();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "commentaire")
    public JAXBElement<Commentaire> createCommentaire(Commentaire value) {
        return new JAXBElement<Commentaire>(_Commentaire_QNAME, Commentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "readAll")
    public JAXBElement<ReadAll> createReadAll(ReadAll value) {
        return new JAXBElement<ReadAll>(_ReadAll_QNAME, ReadAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "readAllResponse")
    public JAXBElement<ReadAllResponse> createReadAllResponse(ReadAllResponse value) {
        return new JAXBElement<ReadAllResponse>(_ReadAllResponse_QNAME, ReadAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "read")
    public JAXBElement<Read> createRead(Read value) {
        return new JAXBElement<Read>(_Read_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commentaires.cours.coffreo.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

}

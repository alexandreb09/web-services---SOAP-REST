
package com.coffreo.cours.commentaires.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CommentaireServiceService",
        targetNamespace = "http://commentaires.cours.coffreo.com/",
        wsdlLocation = "file:/D:/1_Cours/ISIMA/ZZ3/WebService/TP/TP_note/wsdl/CommentaireService.wsdl")
public class CommentaireServiceService
    extends Service
{

    private final static URL COMMENTAIRESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException COMMENTAIRESERVICESERVICE_EXCEPTION;
    private final static QName COMMENTAIRESERVICESERVICE_QNAME = new QName("http://commentaires.cours.coffreo.com/", "CommentaireServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/1_Cours/ISIMA/ZZ3/WebService/TP/TP_note/wsdl/CommentaireService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMMENTAIRESERVICESERVICE_WSDL_LOCATION = url;
        COMMENTAIRESERVICESERVICE_EXCEPTION = e;
    }

    public CommentaireServiceService() {
        super(__getWsdlLocation(), COMMENTAIRESERVICESERVICE_QNAME);
    }

    public CommentaireServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMMENTAIRESERVICESERVICE_QNAME, features);
    }

    public CommentaireServiceService(URL wsdlLocation) {
        super(wsdlLocation, COMMENTAIRESERVICESERVICE_QNAME);
    }

    public CommentaireServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMMENTAIRESERVICESERVICE_QNAME, features);
    }

    public CommentaireServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommentaireServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CommentaireService
     */
    @WebEndpoint(name = "CommentaireServicePort")
    public CommentaireService getCommentaireServicePort() {
        return super.getPort(new QName("http://commentaires.cours.coffreo.com/", "CommentaireServicePort"), CommentaireService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CommentaireService
     */
    @WebEndpoint(name = "CommentaireServicePort")
    public CommentaireService getCommentaireServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://commentaires.cours.coffreo.com/", "CommentaireServicePort"), CommentaireService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMMENTAIRESERVICESERVICE_EXCEPTION!= null) {
            throw COMMENTAIRESERVICESERVICE_EXCEPTION;
        }
        return COMMENTAIRESERVICESERVICE_WSDL_LOCATION;
    }
}

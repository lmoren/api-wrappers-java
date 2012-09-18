package com.miicard.consumers.service.v1.claims.impl;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(
		name = "Claims", 
		targetNamespace = "http://tempuri.org/", 
		wsdlLocation = "http://sts.miicard.com/api/v1/Claims.svc?wsdl")
public class Claims extends Service {

	/**
	 * The Claims WSDL Location.
	 */
    private final static URL CLAIMS_WSDL_LOCATION;
    
    /**
     * The Claims WebServiceException.
     */
    private final static WebServiceException CLAIMS_EXCEPTION;
    
    /**
     * The Claims Qname.
     */
    private final static QName CLAIMS_QNAME 
    	= new QName("http://tempuri.org/", "Claims");

    static {
    	
    	URL url = null;
    	
    	WebServiceException e = null;
    	
    	try {
    		url = new URL("http://sts.miicard.com/api/v1/Claims.svc?wsdl");
    	} catch (MalformedURLException ex) {
    		e = new WebServiceException(ex);
        }
        
    	CLAIMS_WSDL_LOCATION = url;
        CLAIMS_EXCEPTION = e;
    }

    /**
     * Constructor.
     */
    public Claims() {
        super(__getWsdlLocation(), CLAIMS_QNAME);
    }
    
    /**
     * Constructor.
     * 
     * @param features WebServiceFeature
     */
    public Claims(final WebServiceFeature... features) {
        super(__getWsdlLocation(), CLAIMS_QNAME, features);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     */
    public Claims(final URL wsdlLocation) {
        super(wsdlLocation, CLAIMS_QNAME);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param features WebServiceFeature
     */
    public Claims(
    		final URL wsdlLocation, 
    		final WebServiceFeature... features) {
        
    	super(wsdlLocation, CLAIMS_QNAME, features);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param serviceName QName of the service name
     */
    public Claims(
    		final URL wsdlLocation, 
    		final QName serviceName) {
        
    	super(wsdlLocation, serviceName);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param serviceName QName of the service name
     * @param features WebServiceFeature
     */
    public Claims(
    		final URL wsdlLocation, 
    		final QName serviceName, 
    		final WebServiceFeature... features) {
        
    	super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns IClaims
     */
    @WebEndpoint(name = "BasicHttpBinding_IClaims")
    public final IClaims getBasicHttpBindingIClaims() {
        return super.getPort(
        		new QName(
        				"http://tempuri.org/", 
        				"BasicHttpBinding_IClaims"), 
        				IClaims.class);
    }

    /**
     * 
     * @param features 
     * A list of {@link javax.xml.ws.WebServiceFeature} to 
     * configure on the proxy.  Supported features not in the 
     * <code>features</code> parameter will have their default values.
     * 
     * @return returns IClaims
     */
    @WebEndpoint(name = "BasicHttpBinding_IClaims")
    public final IClaims getBasicHttpBindingIClaims(
    		final WebServiceFeature... features) {
    	
    	return super.getPort(
    			new QName(
    					"http://tempuri.org/", 
    					"BasicHttpBinding_IClaims"),
    					IClaims.class,
    					features);
    }

    /**
     * Gets the URL of the WSDL Location.
     * 
     * @return URL of the WSDL Location
     */
    private final static URL __getWsdlLocation() {
        
    	if (CLAIMS_EXCEPTION != null) {
            throw CLAIMS_EXCEPTION;
        }
        
    	return CLAIMS_WSDL_LOCATION;
    }
}

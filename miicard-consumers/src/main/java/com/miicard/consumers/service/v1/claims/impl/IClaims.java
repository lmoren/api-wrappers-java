package com.miicard.consumers.service.v1.claims.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI.
 * 
 * JAX-WS RI 2.2.6-1b01 
 * 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IClaims", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IClaims {
	
	/**
     * @return returns com.miicard.consumers.service.v1.claims.MiiApiResponseOfMiiUserProfile
     */
    @WebMethod(operationName = "GetClaims", action = "http://tempuri.org/IClaims/GetClaims")
    @WebResult(name = "GetClaimsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetClaims", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.GetClaims")
    @ResponseWrapper(localName = "GetClaimsResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.GetClaimsResponse")
    MiiApiResponseOfMiiUserProfile getClaims();

    /**
     * @param type
     * @return returns byte[]
     */
    @WebMethod(operationName = "AssuranceImage", action = "http://tempuri.org/IClaims/AssuranceImage")
    @WebResult(name = "AssuranceImageResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AssuranceImage", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.AssuranceImage")
    @ResponseWrapper(localName = "AssuranceImageResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.AssuranceImageResponse")
    byte[] assuranceImage(
        @WebParam(name = "type", targetNamespace = "http://tempuri.org/")
        String type);

    /**
     * @param socialAccountId
     * @param socialAccountType
     * @return returns com.miicard.consumers.service.v1.claims.MiiApiResponseOfboolean
     */
    @WebMethod(operationName = "IsSocialAccountAssured", action = "http://tempuri.org/IClaims/IsSocialAccountAssured")
    @WebResult(name = "IsSocialAccountAssuredResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsSocialAccountAssured", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.IsSocialAccountAssured")
    @ResponseWrapper(localName = "IsSocialAccountAssuredResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.IsSocialAccountAssuredResponse")
    MiiApiResponseOfBoolean isSocialAccountAssured(
        @WebParam(name = "socialAccountId", targetNamespace = "http://tempuri.org/")
        String socialAccountId,
        @WebParam(name = "socialAccountType", targetNamespace = "http://tempuri.org/")
        String socialAccountType);

    /**
     * @return returns com.miicard.consumers.service.v1.claims.MiiApiResponseOfboolean
     */
    @WebMethod(operationName = "IsUserAssured", action = "http://tempuri.org/IClaims/IsUserAssured")
    @WebResult(name = "IsUserAssuredResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsUserAssured", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.IsUserAssured")
    @ResponseWrapper(localName = "IsUserAssuredResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.claims.IsUserAssuredResponse")
    MiiApiResponseOfBoolean isUserAssured();
}

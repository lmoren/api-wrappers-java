api-wrappers-java
===================

Java wrapper classes around the miiCard API.

This repository houses the source for the latest version of the miiCard Consumers library, and a JSP test harness to verify its functionality.

##What is miiCard
miiCard lets anybody prove their identity to the same level of traceability as using a passport, driver's licence or photo ID. We then allow external web applications to ask miiCard users to share a portion of their identity information with the application through a web-accessible API.

##What is the library for?
miiCard's API is an OAuth-protected web service supporting SOAP, POX and JSON - [documentation](http://www.miicard.com/developers) is available. The library wraps the SOAP endpoint of the API, making it easier to make the required OAuth signed requests. 

You can obtain a consumer key and secret from miiCard by contacting us on our [support form](http://support.miicard.com/anonymous_requests/new), including the details listed on the developer site.

The library and test harness are written as Maven packages. To build, pull down the source then:

   mvn install

in the folder you want to build. The wrapper library will build to a .jar file, the test harness to a .war that can be hosted directly in Tomcat.

##Usage

You'll need to implement your own OAuth exchange with miiCard.com's OAuth endpoint to obtain an access token and secret for a user. Once you've got your consumer key and secret, access token and access token secret you can instantiate an API wrapper:

```java
    	MiiCardOAuthClaimsService service 
    		= new MiiCardOAuthClaimsService(
    				"consumer key",
    				"consumer secret",
    				"access token",
    				"acess token secret"
    		);
```

##Dependencies
The library takes dependencies on

* The [Apache Commons Codec library](http://commons.apache.org/codec/)
* The [oauth-signpost](http://code.google.com/p/oauth-signpost/) library

##Contributing
* Use GitHub issue tracking to report bugs in the library
* If you're going to submit a patch, please base it off the development branch - the master reflects the latest version release to the miiCard website but may not necessarily be bleeding-edge
* Join the [miiCard.com developer forums](http://devforum.miicard.com/) to keep up to date with the latest releases and planned changes
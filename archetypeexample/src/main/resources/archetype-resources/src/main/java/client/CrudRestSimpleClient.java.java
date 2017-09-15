package ${groupId}.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * Simple client for Employee controller using Spring framework 
 * </p>
 */
public class CrudRestSimpleClient.java {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudRestSimpleClient.java.class);
	
	// TODO: Specify the REST controller endpoint
	public static final String REST_SERVICE_URI = "";
	
	private static HttpHeaders getHeaders(){
        /*
         * TODO
         * Add here necessary headers (user & password?)
         */
         
        final HttpHeaders headers = new HttpHeaders();        
        return headers;
    }
	
	private static void invocation() {
		/**
		 * TODO
		 * Add here the invocation to REST endpoint        
		 */
    }
	
	public static final void main(final String args[]) {
		CrudRestSimpleClient.invocation();
	}

}

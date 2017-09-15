package crudspringbootsecurityrest.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ${groupId}.business.BusinessService;
import ${groupId}.model.MyPojoDataModel;

@RestController
@EnableAutoConfiguration
public class MyRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyRestController.class);
	
	/*
	 * TODO
	 * Specify here the endpoint
	 */
	private static final String URL_VALUE_DEFAULT_EMPLOYEE = "";
	
	@Autowired
	private BusinessService businessService;	
	
	@RequestMapping(value = MyRestController.URL_VALUE_DEFAULT_EMPLOYEE, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final Map<String, Object> restMethod() {
        LOGGER.info("Request received");
        Map<String, Object> response = null;
        try {
            /*
             * TODO
             * Do your business
             */
            response = new HashMap<>();
            response.put("STATUS", "SUCCESS");            
        } catch (final Exception excp) {
            LOGGER.error("Request failed", excp);
            response.put("STATUS", "FAILED"");
        }
        LOGGER.info("Request served");
        return response;
    }
	
	/*
	 * TODO
	 * Add as many REST methods as required
	 */

}

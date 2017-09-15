package ${groupId};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
/*
 * TODO: Add properties files if necessary
@PropertySources({		
	@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:application_sec.properties")
	@PropertySource("classpath:application_db.properties"),
	@PropertySource("classpath:application_rest.properties")
})
*/
/**
 * <p>
 * Main class for the Spring Boot application
 *  </p>
 */
public class CrudSpringBoothSecurityRestApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CrudSpringBoothSecurityRestApplication.class);
	
	public static final void main(final String args[]) {
		
		/*
		 * TODO: Add required implementation if necessary 
		 */
		
		LOGGER.info("#######################################################");
		LOGGER.info("");
		LOGGER.info("Starting application.....");
		LOGGER.info("");
		LOGGER.info("#######################################################");
				
		SpringApplication.run(CrudSpringBoothSecurityRestApplication.class, args);		
		
		LOGGER.info("#######################################################");
		LOGGER.info("");
		LOGGER.info("Application up & running");
		LOGGER.info("");
		LOGGER.info("#######################################################");
	}
}
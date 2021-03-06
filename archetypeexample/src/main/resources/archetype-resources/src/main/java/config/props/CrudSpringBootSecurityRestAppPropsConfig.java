package ${groupId}.config.props;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * <p>
 * Usse this class in order to load multiple properties files
 *  <p>
 */
//@Configuration
public class CrudSpringBootSecurityRestAppPropsConfig {
	
	//@Bean
    public static PropertyPlaceholderConfigurer properties() {
        final PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setIgnoreResourceNotFound(true);

        final List<Resource> resourceLst = Arrays.asList(
        		new ClassPathResource("application_db.properties"), 
        		new ClassPathResource("application_url.properties")
        );

        ppc.setLocations(resourceLst.toArray(new Resource[]{}));

        return ppc;
    }

}
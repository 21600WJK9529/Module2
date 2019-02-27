package ac.za.cput;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

        @Bean(name="collections")
        public interfaceCol getService(){
            return new Collections();
        }
    }


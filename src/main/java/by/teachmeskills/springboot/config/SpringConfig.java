package by.teachmeskills.springboot.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringConfig implements WebMvcConfigurer {


    @Bean
    public Logger logger(InjectionPoint injectionPoint) {
        return LogManager.getLogger(injectionPoint.getDeclaredType());
    }
}

package org.elosztott.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FirstApplication {
    @Bean
    FirstService mockFirstService()
    {
        return new  FirstService()
        {
            public String getWelcome()
            {
                return "Welcome!";
            }
        };
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(FirstApplication.class);
        FirstComponent component = context.getBean(FirstComponent.class);
        component.printWelcome();
    }
}

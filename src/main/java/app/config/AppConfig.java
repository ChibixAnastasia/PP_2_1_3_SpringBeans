package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public Cat beanCat(){
        return  new Cat();
    }
    @Bean
    public Dog beanDog(){
        return new Dog();
    }

    @Bean
    public Timer timer(){
        return new Timer();
    }
}

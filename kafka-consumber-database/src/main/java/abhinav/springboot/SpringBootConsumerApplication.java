package abhinav.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("abhinav.springboot.entity")
@EnableJpaRepositories("abhinav.springboot.repository")
@ComponentScan({"abhinav.springboot", "abhinav.springboot.controller"})
public class SpringBootConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class, args);
    }
}
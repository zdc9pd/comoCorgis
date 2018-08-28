package ComoCorgis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

        public static void main(String[] args) {
                System.out.println("Hello from webApp!");
                System.setProperty("server.port","8080");
                SpringApplication.run(Application.class, args);
        }

        @Bean
        public WebMvcConfigurer corsConfigurer() {
                return new WebMvcConfigurerAdapter() {
                        @Override
                        public void addCorsMappings(CorsRegistry registry) {
                                registry.addMapping("/greeting-javaconfig").allowedOrigins("*");
                        }
                };
        }
}

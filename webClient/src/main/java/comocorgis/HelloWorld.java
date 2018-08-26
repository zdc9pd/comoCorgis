package comocorgis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, from webClient!");
        System.setProperty("server.port","9000");
        SpringApplication.run(HelloWorld.class, args);
    }
}

package Application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication
@Configuration
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
        log.info("Started Java-Exercise");
    }
}
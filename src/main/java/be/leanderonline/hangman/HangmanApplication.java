package be.leanderonline.hangman;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HangmanApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(HangmanApplication.class);
        builder.headless(false);
        builder.run(args);
    }

}

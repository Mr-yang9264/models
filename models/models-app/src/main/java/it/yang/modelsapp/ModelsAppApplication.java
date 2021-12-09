package it.yang.modelsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 1
 */
@SpringBootApplication(scanBasePackages = {"it.yang"})
public class ModelsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelsAppApplication.class, args);
    }

}

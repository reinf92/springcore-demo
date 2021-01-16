package me.reinf.demo.chapter3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevDatabaseConfig implements DatabaseConfig{
    @Override
    public void getConfigInformation() {
        System.out.println("DevDatabaseConfigInformation");
    }
}

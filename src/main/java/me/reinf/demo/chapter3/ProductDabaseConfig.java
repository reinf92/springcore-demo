package me.reinf.demo.chapter3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("product")
public class ProductDabaseConfig implements DatabaseConfig {
    @Override
    public void getConfigInformation() {
        System.out.println("ProductDabaseConfigInformation");
    }
}

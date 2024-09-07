package lk.ijse.springIntroduction.config;

import lk.ijse.springIntroduction.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.springIntroduction")
public class AppConfig {
    /*@Bean
    OtherObj otherObj() {
        return new OtherObj();
    }*/
}

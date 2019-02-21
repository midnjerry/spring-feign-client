package games.crusader.springfeignclient.config;

import com.fasterxml.jackson.databind.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.hal.Jackson2HalModule;

@Configuration
public class FeignConfig {
    @Bean
    public Module halModule() {
        // Need this so the Feign Client can deserialize Spring Data HAL responses
        return new Jackson2HalModule();
    }
}

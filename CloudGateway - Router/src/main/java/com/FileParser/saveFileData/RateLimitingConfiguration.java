
import java.beans.BeanProperty;

@Configuration
public class RateLimitingConfiguration {

        @Bean
        public KeyResolver ipKeyResolver(){
            return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
        }
}

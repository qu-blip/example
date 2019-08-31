import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComputerFactary {
    @Bean
    public Computer getCache(){

            return  new ComputerImp();

    }

}

package czw.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(4)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("MyApplicationRunner2------" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName: optionNames){
            System.out.println("2-key:" + optionName + ";value:" + args.getOptionValues(optionName));
        }
    }
}

package czw;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

//除去某个配置类
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args){
//        SpringApplication.run(App.class,args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }
}

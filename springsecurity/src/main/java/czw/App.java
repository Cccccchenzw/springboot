package czw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

//除去某个配置类
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

/**
 * Field userMapper in czw.service.UserService required a bean of type 'czw.mapper.UserMapper' that could not be found.
 * 明明加上了@Mapper但还是识别不到，需要让App启动时在制定的包下去找@MapperScan("czw.mapper")
 * */
@EnableAutoConfiguration
@ComponentScan
@EnableCaching
@MapperScan("czw.mapper")
public class App {
    public static void main(String[] args){
//        SpringApplication.run(App.class,args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }
}

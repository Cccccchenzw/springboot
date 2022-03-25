package czw.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
    @Bean
    public Realm realm(){
        TextConfigurationRealm realm = new TextConfigurationRealm();
//        直接配置了两个用户，并未连接数据库
        realm.setUserDefinitions("czw=123,user\n admin=123,admin");
        realm.setRoleDefinitions("admin=read,write\n user=read");
        return realm;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
        DefaultShiroFilterChainDefinition definition = new DefaultShiroFilterChainDefinition();
//        /login和/doLogin可以匿名访问
        definition.addPathDefinition("/login","anon");
        definition.addPathDefinition("/doLogin","anon");
//        注销登录
        definition.addPathDefinition("/logout","logout");
        definition.addPathDefinition("/*/*","authc");
        return definition;
    }

    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

}

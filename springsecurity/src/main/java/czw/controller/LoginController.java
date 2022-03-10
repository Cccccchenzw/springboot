package czw.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestController
public class LoginController {
    @GetMapping("/hello")
    public String hello(){
        String string = "Hello!Spring Boot!";
        return string;
    }

    @GetMapping("/hello2")
    @ResponseBody
    public void hello2(Model model){
//        model可以获取info的数据
        Map<String,Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>>>>" + value);
        }
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}



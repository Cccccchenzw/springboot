package czw.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice //全局数据处理组件
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String,Object> userInfo(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","chenzhangwen");
        map.put("money",6666);
        return map;
    }

//    @InitBinder 对参数的预处理
    @InitBinder("czw")
    public void init(WebDataBinder binder){
        binder.setFieldDefaultPrefix("czw.");
    }

    @InitBinder("maria")
    public void init2(WebDataBinder binder){
        binder.setFieldDefaultPrefix("maria.");
    }
}

package czw.controller;

import czw.model.Czw;
import czw.model.Maria;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CzwController {
//    @Autowired
//    Czw czw;
    @RequestMapping("/czw")
    public ModelAndView czw(){
//        int i = 100 / 0;
        List<Czw> czws = new ArrayList<>();
        Czw czw1 = new Czw();
        czw1.setBoy(true);
        czw1.setName("pig_pig1");
        czw1.setNumber(1000);
        czw1.setDate(new Date());
        Czw czw2 = new Czw();
        czw2.setBoy(true);
        czw2.setName("pig_pig2");
        czw2.setNumber(2000);
        czw2.setDate(new Date());
        Czw czw3 = new Czw();
        czw3.setBoy(true);
        czw3.setName("pig_pig3");
        czw3.setNumber(3000);
        czw3.setDate(new Date());
        ModelAndView modelAndView = new ModelAndView();
        czws.add(czw1);
        czws.add(czw2);
        czws.add(czw3);
        modelAndView.addObject("czw",czws);
        modelAndView.setViewName("czw");
        return modelAndView;
    }

    @RequestMapping("/json")
    public Czw json(){
        Czw czw1 = new Czw();
        czw1.setBoy(true);
        czw1.setName("pig_pig1");
        czw1.setNumber(1000);
        czw1.setDate(new Date());
        return czw1;
    }
//    请求参数预处理
    @RequestMapping("/show")
    @ResponseBody
    public String show(@ModelAttribute("czw") Czw czw, @ModelAttribute("maria")Maria maria){
        return czw.toString() + "---" + maria.toString();
    }
}

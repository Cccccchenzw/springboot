package czw.controller;

import org.apache.shiro.authc.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(AuthenticationException.class)
    public ModelAndView error(AuthenticationException e){
        ModelAndView mv = new ModelAndView("unauthorized");
        mv.addObject("error",e.getMessage());
        return mv;
    }
}

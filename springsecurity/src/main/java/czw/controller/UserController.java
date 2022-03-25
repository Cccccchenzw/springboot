package czw.controller;

import czw.aop.UserServiceAop;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceAop userServiceAop;

    @RequestMapping("/getUserById")
    public String getUserById(Integer id){
        return userServiceAop.getUserById(id);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userServiceAop.deleteUserById(id);
    }

//    shiro部分登录信息
    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model){
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            model.addAttribute("error","用户名或密码错误！");
            return "login";
        }
        return "redirect:/index";
    }

    @RequiresRoles("admin")
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequiresRoles(value = {"admin","user"},logical = Logical.OR)
    @GetMapping("/user")
    public String user(){
        return "user";
    }
}

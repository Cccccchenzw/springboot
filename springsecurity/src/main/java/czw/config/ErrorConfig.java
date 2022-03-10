package czw.config;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.ErrorPage;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.http.HttpStatus;
//
//@Configurable
//public class ErrorConfig {
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
//        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//            @Override
//            public void customize(ConfigurableWebServerFactory factory) {
//                ErrorPage errorPage = new ErrorPage(HttpStatus.BAD_REQUEST,"/error0");
//                ErrorPage errorPage2 = new ErrorPage(HttpStatus.NOT_FOUND,"/error0");
//                ErrorPage errorPage3 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error0");
//                factory.addErrorPages(errorPage,errorPage2,errorPage3);
//            }
//        };
//    }
//}

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

//自定义error数据
@Component
public class ErrorConfig extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String,Object> errorAttributes = super.getErrorAttributes(webRequest,includeStackTrace);
        errorAttributes.put("custommsg","出错了！兄dei！");
        errorAttributes.remove("error");
        return errorAttributes;
    }
}
//自定义error视图
//@Component
//public class ErrorConfig implements ErrorViewResolver {
//    @Override
//    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
//        ModelAndView mv = new ModelAndView("errorPage");
//        mv.addObject("custommsg","有冇有搞错啊？！");
//        mv.addAllObjects(model);
//        return mv;
//    }
//}



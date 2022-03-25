//package czw.config;
//
//import czw.mapper.MenuMapper;
//import czw.model.Menu;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.web.FilterInvocation;
//import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
//import org.springframework.stereotype.Component;
//import org.springframework.util.AntPathMatcher;
//
//import java.util.Collection;
//import java.util.List;
//
//@Component
//public class CustomFilterInvocationSecurityMetadataSource  implements FilterInvocationSecurityMetadataSource {
//    AntPathMatcher antPathMatcher = new AntPathMatcher();
//
//    @Autowired
//    MenuMapper menuMapper;
//
//    @Override
//    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
//        String requestUrl = ((FilterInvocation) o).getRequestUrl();
//        List<Menu> allMenus = menuMapper.getAllMenus();
//        for (Menu menu:allMenus){
//            if (antPathMatcher.match(menu.getPattern(),requestUrl)){
////                menu.getRoles();bug here!!!
//                String[] roleArr = new String[3];
//                for (int i = 0;i<roleArr.length;i++){
////                    roleArr[i] =
//                }
//            }
//        }
//    }
//
//    @Override
//    public Collection<ConfigAttribute> getAllConfigAttributes() {
//        return null;
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return false;
//    }
//}

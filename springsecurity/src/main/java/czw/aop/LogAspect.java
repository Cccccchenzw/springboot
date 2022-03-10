package czw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* czw.aop.*.*(..))")
    public void pc1(){

    }
    @Before(value = "pc1()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行了！！！");
    }
    @After(value = "pc1()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行结束了！！！");
    }
    @AfterReturning(value = "pc1()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法返回值为：" + result);
    }
    @AfterThrowing(value = "pc1()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛异常啦！！！" + e.getMessage());
    }
    @Around("pc1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        return proceedingJoinPoint.proceed();
    }
}

package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "userProxy")
@Aspect         //生成代理对象
@Order(2)
public class UserProxy {

    //相同切入点的抽取
    @Pointcut(value = "execution(* aop.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before..........");
    }

    //后置通知
    @AfterReturning(value = "execution(* aop.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning..........");
    }

    //环绕通知
    @Around(value = "execution(* aop.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }


    //异常通知
    @AfterThrowing(value = "execution(* aop.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

    //最终通知
    @After(value = "execution(* aop.User.add(..))")
    public void after() {
        System.out.println("after.........");
    }



}

package aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "personProxy")
@Aspect
@Order(1)       //增强类优先级，数字越小优先级越高
public class PersonProxy {

    @Before(value = "execution(* aop.User.add(..))")
    public void personBefore(){
        System.out.println("personBefore......");
    }
}

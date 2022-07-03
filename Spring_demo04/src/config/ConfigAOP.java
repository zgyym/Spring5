package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration      //作为配置类来替代xml配置文件
@ComponentScan(basePackages = {"aop"})      //组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)    //Aspect生成代理对象
public class ConfigAOP {
}

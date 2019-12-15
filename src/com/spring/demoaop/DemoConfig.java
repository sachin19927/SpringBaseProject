package com.spring.demoaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
// spring pure java configuration
@Configuration
@EnableAspectJAutoProxy     //Sring can AOP objects for calling (Spring AOP proxy support)
@ComponentScan("com.spring.demoaop")
public class DemoConfig {

}

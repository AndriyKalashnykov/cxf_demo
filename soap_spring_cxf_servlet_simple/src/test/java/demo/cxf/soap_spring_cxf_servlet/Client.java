package demo.cxf.soap_spring_cxf_servlet;

import demo.cxf.soap_spring_cxf_servlet_simple.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}

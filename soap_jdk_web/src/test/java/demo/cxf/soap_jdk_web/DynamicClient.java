package demo.cxf.soap_jdk_web;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class DynamicClient {

    public static void main(String[] args) {
        try {
            URL wsdl = new URL("http://localhost:8080/ws/soap/hello?wsdl");
            QName serviceName = new QName("http://soap_jdk_web.cxf.demo/", "HelloService");
            QName portName = new QName("http://soap_jdk_web.cxf.demo/", "HelloServicePort");
            Service service = Service.create(wsdl, serviceName);

            HelloService helloService = service.getPort(portName, HelloService.class);
            String result = helloService.say("world");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

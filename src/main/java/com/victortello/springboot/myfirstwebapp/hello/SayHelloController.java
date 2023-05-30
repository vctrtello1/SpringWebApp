package com.victortello.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // Say Hello

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!!!";

    }

    @RequestMapping("sayHelloHTML")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title>My fist HTML Page</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");
        stringBuffer.append("<h1>Hello world!</h1>");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();

    }

    @RequestMapping("sayHelloJSP")
    public String sayHelloJSP() {
        return "sayHello";

    }

}

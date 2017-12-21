package pl.knpj.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorldBean {

    public HelloWorldBean() {
        System.out.println("Hello world started");
    }

    public String getMessage() {
        return "Hello World";
    }
}

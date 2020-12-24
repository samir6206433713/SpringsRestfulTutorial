package com.example.samir.webserivices.restfulwebservices.helloworld;

public class HelloWroldbean {

    private  String helloworldbean;

    public String getHelloworldbean() {
        return helloworldbean;
    }

    public void setHelloworldbean(String helloworldbean) {
        this.helloworldbean = helloworldbean;
    }

    @Override
    public String toString() {
        return "HelloWroldbean{" +
                "helloworldbean='" + helloworldbean + '\'' +
                '}';
    }

    public HelloWroldbean(String helloworldbean) {
        
        this.helloworldbean=helloworldbean;
    }
}

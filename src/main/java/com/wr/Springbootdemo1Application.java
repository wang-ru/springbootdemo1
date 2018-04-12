package com.wr;

import com.wr.model.Admin;
import com.wr.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@SpringBootApplication
public class Springbootdemo1Application {
    @RequestMapping("date")
    @ResponseBody
    public String date(Date date) {
        return date.toString();
    }
    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello(@RequestParam(name = "xage", required = false) Integer age) {
        return "age:" + age;
    }
//asdfadsfa
    @RequestMapping("aaa")
    @ResponseBody
//    sfasdfasfdasdfafds
    public String hello1(User user, Admin admin) {
        return "user:" + user.toString() + " admin" + admin.toString();
    }
    @InitBinder("admin")
    public void initAdmin(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("admin.");
    }
    @InitBinder("user")
    public void initUser(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("user.");
    }
    @RequestMapping("date")
    @ResponseBody
    public String date(Date date) {
        return date.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo1Application.class, args);
    }

}

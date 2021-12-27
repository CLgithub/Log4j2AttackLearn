package com.cl.learn.vulnerableserver.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author l
 * @Date 2021/12/14 16:50
 */
@RestController
public class C1 {

    private static final Logger LOGGER= LogManager.getLogger(C1.class);




    @RequestMapping("/service1")
    public void service1(@RequestParam("str1") String str1, HttpServletResponse response) throws IOException {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");

//        LOGGER.error(str1);
        LOGGER.info("用户输入："+str1);

        response.sendRedirect("index.html");
    }
}

package com.example.springboot_002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Springboot002Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot002Application.class, args);
    }


    /**
     * 设置匹配*.action后缀请求
     *
     * @param dispatcherServlet
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
        servletServletRegistrationBean.addUrlMappings("*.do");
        return servletServletRegistrationBean;
    }



    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(5000000);
        multipartResolver.setDefaultEncoding("UTF-8");
        return multipartResolver;
    }


    /**
     *
     * @return

     @Bean
     @Bean public MultipartResolver multipartResolver() {
     StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();

     return multipartResolver;
     }
     */

}



package com.example.springboothello;

import com.example.springboothello.servlet.HelloFilter;
import com.example.springboothello.servlet.HelloListener;
import com.example.springboothello.servlet.HelloServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
	}

	// Register Servlet
	@Bean
	public ServletRegistrationBean<HelloServlet> gServletRegistrationBean() {
		ServletRegistrationBean<HelloServlet> servletBean = new ServletRegistrationBean<>(new HelloServlet());
		servletBean.addUrlMappings("/helloServlet");
		return servletBean;
	}

	// Register Fitler
	@Bean
	public FilterRegistrationBean<HelloFilter> gFilterRegistrationBean() {
		FilterRegistrationBean<HelloFilter> filterBean = new FilterRegistrationBean<>(new HelloFilter());
		filterBean.addUrlPatterns("/helloServlet");
		return filterBean;
	}

	// Register Listener
	@Bean
	public ServletListenerRegistrationBean<HelloListener> gListenerRegistrationBean() {
		ServletListenerRegistrationBean<HelloListener> listenerBean = new ServletListenerRegistrationBean<>(
				new HelloListener());
		return listenerBean;
	}
}

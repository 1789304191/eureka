package com.lgx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
//http://LAPTOP-F8JPJ93V:8888/通过这个服务明查找配置信息，当注册到服务中心时
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}

	@Value("${democonfigclient.message}")
	String democonfigclient;
	@RequestMapping(value = "/goodbye")
	public String goodbye(){
		return democonfigclient;
	}
}

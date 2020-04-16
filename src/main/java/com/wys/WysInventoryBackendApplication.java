package com.wys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//自動掃描 Spring Bean 元件
@ComponentScan( basePackages = {"com.wys"} )
@SpringBootApplication
public class WysInventoryBackendApplication extends SpringBootServletInitializer {
	
	//加這個是為了讓部署可以在其他container而不吃default的tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WysInventoryBackendApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(WysInventoryBackendApplication.class, args);
	}

}

package org.penitence.spring.oauth2;

import org.penitence.spring.oauth2.services.ClientDetailServiceImpl;
import org.penitence.spring.oauth2.services.UserDetailServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAuthorizationServer
@RestController
@EnableResourceServer
public class SpringCloudOauth2ServerApplication {

    @Bean
    public ClientDetailsService clientDetailsService(){
        return new ClientDetailServiceImpl();
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2ServerApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal user){
	    return user;
    }
}

/*
package tn.pi.proerty.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;

import java.util.List;

@Configuration
@EnableWs
public class WebConfig extends WsConfigurerAdapter {

    @Bean
    public EndpointInterceptor corsInterceptor() {
        return new SimpleCorsInterceptor();
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(corsInterceptor());
    }
}*/

package com.luis.infra.configsvr;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication{
    public static void main(String[] args){
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}

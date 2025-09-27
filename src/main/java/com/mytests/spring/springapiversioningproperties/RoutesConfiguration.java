package com.mytests.spring.springapiversioningproperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.*;


@Configuration
public class RoutesConfiguration {
    @Bean
    RouterFunction<ServerResponse> test2Routes() {
        return
                RouterFunctions.route()
                        .nest(path("/functional"), router -> router
                        .GET("/test2", version("1.1"),
                                request -> ServerResponse.ok().body("functional test2 1.1"))
                        .GET("/test2", version("1.2"),
                                request -> ServerResponse.ok().body("functional test2 1.2"))
                        .GET("/test2", version("1.3"),
                                request -> ServerResponse.ok().body("functional test2 1.3"))
                        ).build();

    }
}

package com.mytests.spring.springapiversioningproperties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.web.servlet.client.RestTestClient;
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
import org.springframework.web.client.ApiVersionInserter;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class SpringApiVersioningRestTestClientTest {

    private RestTestClient client;
    @Autowired private WebApplicationContext context;

    @BeforeEach
    void setUp() {
        this.client = RestTestClient
                .bindToApplicationContext(context)
              //  .apiVersionInserter(ApiVersionInserter.useQueryParam("version-param"))
                .build();
    }

    @Test
    void test11() {
        client.get().uri("/annotated/test1/{id}","1")
                .apiVersion(1.1)
                .exchange()
                .expectStatus().isOk()
        ;
    }

}

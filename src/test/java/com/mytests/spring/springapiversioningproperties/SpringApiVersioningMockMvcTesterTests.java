package com.mytests.spring.springapiversioningproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
import org.springframework.web.client.ApiVersionInserter;

@SpringBootTest
@AutoConfigureMockMvc
class SpringApiVersioningMockMvcTesterTests {


    @Autowired
    private MockMvcTester mockMvcTester;

    @Test
    void testVersion11() {
        mockMvcTester.get().uri("/annotated/test1/{id}", "1")
                .apiVersion(1.1).assertThat().hasStatusOk();
    }

   /* @TestConfiguration
    static class SpringApiVersioningPropertiesApplicationTestsConfig implements MockMvcBuilderCustomizer {
        @Override
        public void customize(ConfigurableMockMvcBuilder<?> builder) {
            builder.apiVersionInserter(ApiVersionInserter.useQueryParam("version-param"));
        }
    }*/


}

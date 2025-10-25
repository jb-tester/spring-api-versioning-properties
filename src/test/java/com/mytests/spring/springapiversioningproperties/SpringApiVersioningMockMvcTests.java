package com.mytests.spring.springapiversioningproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
import org.springframework.web.client.ApiVersionInserter;

@SpringBootTest
@AutoConfigureMockMvc
class SpringApiVersioningMockMvcTests {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void testVersion11() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/annotated/test1/{id}", "1")
                        .apiVersion(1.1))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("annotated test1 with path variable 1, version 1.1"));
    }

    @TestConfiguration
    static class SpringApiVersioningMockMvcTestsConfig implements MockMvcBuilderCustomizer {
        @Override
        public void customize(ConfigurableMockMvcBuilder<?> builder) {
            builder.apiVersionInserter(ApiVersionInserter.useQueryParam("version-param"));
        }
    }


}

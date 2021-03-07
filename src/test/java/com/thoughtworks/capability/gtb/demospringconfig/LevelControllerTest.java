package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/3/7 3:59 下午
 */
@WebMvcTest(properties = "levelNumber=1")
public class LevelControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Nested
    class WhenPropertiesExists {
        @Test
        void should_return_advanced() throws Exception {
            MvcResult mvcResult = mockMvc
                    .perform(get("/level"))
                    .andReturn();
            assertThat(mvcResult.getResponse().getContentAsString()).isEqualTo("advanced");
        }

    }
}

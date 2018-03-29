package com.voc.spring.boot.testcase;

import com.voc.spring.boot.demo.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Wu Yujie
 * @email coffee377@dingtalk.com
 * @time 2018/03/19 19:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class UserControllerTest {
    private transient final static Logger log = LoggerFactory.getLogger(UserControllerTest.class);

    @Resource
    private MockMvc mockMvc;

    @Test
    public void getUserById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(get("/user/1")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .param("current", "1")
//                        .param("size", "2")
                )
                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()").value(4))
                .andExpect(jsonPath("$.id").value(1))
                .andReturn();
        log.info(mvcResult.getResponse().getContentAsString());
    }

}

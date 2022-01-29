package com.bcc.data;

import java.time.Period;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc(addFilters = false)
public class BccDataApplicationTests {

  private ObjectMapper objectMapper = new ObjectMapper();

  @Test
  public void contextLoads() throws Exception {

    Period period = Period.of(0, 2, 3);
    System.out.println(objectMapper.writeValueAsString(period));

  }

}

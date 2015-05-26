package com.medem.validator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class ValidatorTest {
    
    @Autowired
    private AreaValidator areaValidator;
    
    @Test
    public void testAppCtx(){
      Assert.assertNotNull(areaValidator);
    }

}

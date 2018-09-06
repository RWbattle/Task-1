package com.iceneet;

import com.iceneet.service.Signupservice;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeoutException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SignupDaoTest {
    @Autowired
    private Signupservice signupservice;

    @Test
    public void Test() throws InterruptedException, MemcachedException, TimeoutException {
        System.out.println(signupservice.GetSignupById(1));

    }

}

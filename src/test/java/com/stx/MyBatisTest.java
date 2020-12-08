package com.stx;

import com.stx.domain.Fine;
import com.stx.mapper.FineMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Aythor :张国军
 * @Date ：Created in 20:35 2020/12/8
 * @Description : my_app
 **/
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatisTest {
    @Autowired
    private FineMapper fineMapper;

    @Test
    public void fun1(){
        Fine fine=new Fine();
        fine.setF_id(1);
        fine.setFid(1);
        fine.setAmount(1000);
        fine.setFine(1000);

        fineMapper.save(fine);
    }



}

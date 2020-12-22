package com.stx;

import com.stx.domain.Bonus;
import com.stx.domain.Fine;
import com.stx.mapper.BonusMapper;
import com.stx.mapper.FineMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author ChengXing
 * @Date Created in 16:29 2020/12/22
 * @Description stx
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class FineTest {
    @Autowired
    private FineMapper fineMapper;

    @Test
    public void addBonusByEmployeeId(){
        Fine fine = new Fine(10.0,"骂脏话",1);
        fineMapper.addFineByEmployeeId(fine);
    }

    @Test
    public void deleteBonusById(){
        fineMapper.deleteFineById(1002);
    }

    @Test
    public void updateBonus(){
        Fine fine = new Fine(1001,30.0,"骂脏话",1);
        fineMapper.updateFine(fine);
    }
}

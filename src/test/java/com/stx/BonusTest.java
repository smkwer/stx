package com.stx;

import com.stx.domain.Bonus;
import com.stx.mapper.BonusMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author ChengXing
 * @Date Created in 15:31 2020/12/22
 * @Description stx
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BonusTest {
    @Autowired
    private BonusMapper bonusMapper;

    @Test
    public void addBonusByEmployeeId(){
        Bonus bonus = new Bonus(40.0,"早退",1);
        bonusMapper.addBonusByEmployeeId(bonus);
    }

    @Test
    public void deleteBonusById(){
        bonusMapper.deleteBonusById(3);
    }

    @Test
    public void updateBonus(){
        Bonus bonus = new Bonus(1,100.0,"满勤",1);
        bonusMapper.updateBonus(bonus);
    }
}

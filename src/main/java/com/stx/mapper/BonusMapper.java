package com.stx.mapper;

import com.stx.domain.Bonus;

/**
 * @author ChengXing
 * @Date Created in 15:22 2020/12/22
 * @Description stx
 */
public interface BonusMapper {
    /**
     * 根据老师id添加奖金信息
     *
     * @param bonus
     * @return
     */
    int addBonusByEmployeeId(Bonus bonus);

    /**
     * 根据id删除奖金
     * @param bid
     * @return
     */
    int deleteBonusById(int bid);

    /**
     * 修改奖金信息
     * @param bonus
     * @return
     */
    int updateBonus(Bonus bonus);
}

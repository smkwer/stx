package com.stx.mapper;

import com.stx.domain.Bonus;
import com.stx.domain.Fine;

/**
 * @author ChengXing
 * @Date Created in 16:24 2020/12/22
 * @Description stx
 */
public interface FineMapper {
    /**
     * 根据老师id添加罚金信息
     *
     * @param fine
     * @return
     */
    int addFineByEmployeeId(Fine fine);

    /**
     * 根据id删除罚金
     *
     * @param bid
     * @return
     */
    int deleteFineById(int bid);

    /**
     * 修改罚金信息
     *
     * @param fine
     * @return
     */
    int updateFine(Fine fine);
}

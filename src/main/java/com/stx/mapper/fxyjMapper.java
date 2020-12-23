package com.stx.mapper;


import com.stx.domain.Fxyj;

import java.util.List;

public interface fxyjMapper {
    /**
     * 增加一条fxyj表记录
     * @param fxyj
     * @return
     */
    int insertFxyj(Fxyj fxyj);

    /**
     * 删除一条fxyj表记录
     * @param fxyj
     * @return
     */
    int deleteFxyj(Fxyj fxyj);


    /**
     * 查询所有fxyj表记录
     * @return
     */
    List<Fxyj> findAll();
}

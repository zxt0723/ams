package com.haibei.service.application;

import com.haibei.pojo.application.Params;
import com.haibei.pojo.application.ParamsExample;
import java.util.List;

public interface ParamsService {
    int countByExample(ParamsExample example);

    Params selectByPrimaryKey(Long wid);

    List<Params> selectByExample(ParamsExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(Params record);

    int updateByPrimaryKey(Params record);

    int deleteByExample(ParamsExample example);

    int updateByExampleSelective(Params record, ParamsExample example);

    int updateByExample(Params record, ParamsExample example);

    int insert(Params record);

    int insertSelective(Params record);
}
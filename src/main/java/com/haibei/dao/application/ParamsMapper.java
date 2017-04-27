package com.haibei.dao.application;

import com.haibei.pojo.application.Params;
import com.haibei.pojo.application.ParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamsMapper {
    int countByExample(ParamsExample example);

    int deleteByExample(ParamsExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(Params record);

    int insertSelective(Params record);

    List<Params> selectByExample(ParamsExample example);

    Params selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") Params record, @Param("example") ParamsExample example);

    int updateByExample(@Param("record") Params record, @Param("example") ParamsExample example);

    int updateByPrimaryKeySelective(Params record);

    int updateByPrimaryKey(Params record);
}
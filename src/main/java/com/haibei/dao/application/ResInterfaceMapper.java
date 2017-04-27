package com.haibei.dao.application;

import com.haibei.pojo.application.ResInterface;
import com.haibei.pojo.application.ResInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResInterfaceMapper {
    int countByExample(ResInterfaceExample example);

    int deleteByExample(ResInterfaceExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(ResInterface record);

    int insertSelective(ResInterface record);

    List<ResInterface> selectByExample(ResInterfaceExample example);

    ResInterface selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") ResInterface record, @Param("example") ResInterfaceExample example);

    int updateByExample(@Param("record") ResInterface record, @Param("example") ResInterfaceExample example);

    int updateByPrimaryKeySelective(ResInterface record);

    int updateByPrimaryKey(ResInterface record);
}
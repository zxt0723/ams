package com.haibei.dao.application;

import com.haibei.pojo.application.Interface;
import com.haibei.pojo.application.InterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceMapper {
    int countByExample(InterfaceExample example);

    int deleteByExample(InterfaceExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(Interface record);

    int insertSelective(Interface record);

    List<Interface> selectByExample(InterfaceExample example);

    Interface selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") Interface record, @Param("example") InterfaceExample example);

    int updateByExample(@Param("record") Interface record, @Param("example") InterfaceExample example);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}
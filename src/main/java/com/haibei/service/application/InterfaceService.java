package com.haibei.service.application;

import com.haibei.pojo.application.Interface;
import com.haibei.pojo.application.InterfaceExample;
import java.util.List;

public interface InterfaceService {
    int countByExample(InterfaceExample example);

    Interface selectByPrimaryKey(Long wid);

    List<Interface> selectByExample(InterfaceExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);

    int deleteByExample(InterfaceExample example);

    int updateByExampleSelective(Interface record, InterfaceExample example);

    int updateByExample(Interface record, InterfaceExample example);

    int insert(Interface record);

    int insertSelective(Interface record);
}
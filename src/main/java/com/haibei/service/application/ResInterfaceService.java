package com.haibei.service.application;

import com.haibei.pojo.application.ResInterface;
import com.haibei.pojo.application.ResInterfaceExample;
import java.util.List;

public interface ResInterfaceService {
    int countByExample(ResInterfaceExample example);

    ResInterface selectByPrimaryKey(Long wid);

    List<ResInterface> selectByExample(ResInterfaceExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(ResInterface record);

    int updateByPrimaryKey(ResInterface record);

    int deleteByExample(ResInterfaceExample example);

    int updateByExampleSelective(ResInterface record, ResInterfaceExample example);

    int updateByExample(ResInterface record, ResInterfaceExample example);

    int insert(ResInterface record);

    int insertSelective(ResInterface record);
}
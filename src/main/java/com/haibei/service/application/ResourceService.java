package com.haibei.service.application;

import com.haibei.pojo.application.Resource;
import com.haibei.pojo.application.ResourceExample;
import java.util.List;

public interface ResourceService {
    int countByExample(ResourceExample example);

    Resource selectByPrimaryKey(Long wid);

    List<Resource> selectByExample(ResourceExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    int deleteByExample(ResourceExample example);

    int updateByExampleSelective(Resource record, ResourceExample example);

    int updateByExample(Resource record, ResourceExample example);

    int insert(Resource record);

    int insertSelective(Resource record);
}
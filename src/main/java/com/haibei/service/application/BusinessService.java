package com.haibei.service.application;

import com.haibei.pojo.application.Business;
import com.haibei.pojo.application.BusinessExample;
import java.util.List;

public interface BusinessService {
    int countByExample(BusinessExample example);

    Business selectByPrimaryKey(Long wid);

    List<Business> selectByExample(BusinessExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);

    int deleteByExample(BusinessExample example);

    int updateByExampleSelective(Business record, BusinessExample example);

    int updateByExample(Business record, BusinessExample example);

    int insert(Business record);

    int insertSelective(Business record);
}
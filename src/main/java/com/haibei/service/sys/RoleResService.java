package com.haibei.service.sys;

import com.haibei.pojo.sys.RoleRes;
import com.haibei.pojo.sys.RoleResExample;
import java.util.List;

public interface RoleResService {
    int countByExample(RoleResExample example);

    RoleRes selectByPrimaryKey(Long wid);

    List<RoleRes> selectByExample(RoleResExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(RoleRes record);

    int updateByPrimaryKey(RoleRes record);

    int deleteByExample(RoleResExample example);

    int updateByExampleSelective(RoleRes record, RoleResExample example);

    int updateByExample(RoleRes record, RoleResExample example);

    int insert(RoleRes record);

    int insertSelective(RoleRes record);
}
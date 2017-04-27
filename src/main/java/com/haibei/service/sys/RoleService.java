package com.haibei.service.sys;

import com.haibei.pojo.sys.Role;
import com.haibei.pojo.sys.RoleExample;
import java.util.List;

public interface RoleService {
    int countByExample(RoleExample example);

    Role selectByPrimaryKey(Long wid);

    List<Role> selectByExample(RoleExample example);

    int deleteByPrimaryKey(Long wid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    int deleteByExample(RoleExample example);

    int updateByExampleSelective(Role record, RoleExample example);

    int updateByExample(Role record, RoleExample example);

    int insert(Role record);

    int insertSelective(Role record);
}
package com.haibei.dao.sys;

import com.haibei.pojo.sys.RoleRes;
import com.haibei.pojo.sys.RoleResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResMapper {
    int countByExample(RoleResExample example);

    int deleteByExample(RoleResExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(RoleRes record);

    int insertSelective(RoleRes record);

    List<RoleRes> selectByExample(RoleResExample example);

    RoleRes selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") RoleRes record, @Param("example") RoleResExample example);

    int updateByExample(@Param("record") RoleRes record, @Param("example") RoleResExample example);

    int updateByPrimaryKeySelective(RoleRes record);

    int updateByPrimaryKey(RoleRes record);
}
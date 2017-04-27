package com.haibei.service.impl.sys;

import com.haibei.dao.sys.RoleResMapper;
import com.haibei.pojo.sys.RoleRes;
import com.haibei.pojo.sys.RoleResExample;
import com.haibei.service.sys.RoleResService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleResServiceImpl implements RoleResService {
    @Autowired
    private RoleResMapper roleResMapper;

    public int countByExample(RoleResExample example) {
        int count = this.roleResMapper.countByExample(example);
        return count;
    }

    public RoleRes selectByPrimaryKey(Long wid) {
        return this.roleResMapper.selectByPrimaryKey(wid);
    }

    public List<RoleRes> selectByExample(RoleResExample example) {
        return this.roleResMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.roleResMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(RoleRes record) {
        return this.roleResMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(RoleRes record) {
        return this.roleResMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(RoleResExample example) {
        return this.roleResMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(RoleRes record, RoleResExample example) {
        return this.roleResMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(RoleRes record, RoleResExample example) {
        return this.roleResMapper.updateByExample(record, example);
    }

    public int insert(RoleRes record) {
        return this.roleResMapper.insert(record);
    }

    public int insertSelective(RoleRes record) {
        return this.roleResMapper.insertSelective(record);
    }
}
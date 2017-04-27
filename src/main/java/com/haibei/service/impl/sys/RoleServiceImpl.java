package com.haibei.service.impl.sys;

import com.haibei.dao.sys.RoleMapper;
import com.haibei.pojo.sys.Role;
import com.haibei.pojo.sys.RoleExample;
import com.haibei.service.sys.RoleService;
import com.haibei.service.sys.SequenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private SequenceService sequenceService;

    public int countByExample(RoleExample example) {
        int count = this.roleMapper.countByExample(example);
        return count;
    }

    public Role selectByPrimaryKey(Long wid) {
        return this.roleMapper.selectByPrimaryKey(wid);
    }

    public List<Role> selectByExample(RoleExample example) {
        return this.roleMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.roleMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(Role record) {
        return this.roleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Role record) {
        return this.roleMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(RoleExample example) {
        return this.roleMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Role record, RoleExample example) {
        return this.roleMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Role record, RoleExample example) {
        return this.roleMapper.updateByExample(record, example);
    }

    public int insert(Role record) {
    	record.setWid(this.sequenceService.getSequences("T_AMS_ROLE").longValue());
        return this.roleMapper.insert(record);
    }

    public int insertSelective(Role record) {
    	record.setWid(this.sequenceService.getSequences("T_AMS_ROLE").longValue());
        return this.roleMapper.insertSelective(record);
    }
}
package com.haibei.service.impl.application;

import com.haibei.dao.application.InterfaceMapper;
import com.haibei.pojo.application.Interface;
import com.haibei.pojo.application.InterfaceExample;
import com.haibei.service.application.InterfaceService;
import com.haibei.service.sys.SequenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceServiceImpl implements InterfaceService {
    @Autowired
    private InterfaceMapper interfaceMapper;
    @Autowired
    private SequenceService sequenceService;
    public int countByExample(InterfaceExample example) {
        int count = this.interfaceMapper.countByExample(example);
        return count;
    }

    public Interface selectByPrimaryKey(Long wid) {
        return this.interfaceMapper.selectByPrimaryKey(wid);
    }

    public List<Interface> selectByExample(InterfaceExample example) {
        return this.interfaceMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.interfaceMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(Interface record) {
        return this.interfaceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Interface record) {
        return this.interfaceMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(InterfaceExample example) {
        return this.interfaceMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Interface record, InterfaceExample example) {
        return this.interfaceMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Interface record, InterfaceExample example) {
        return this.interfaceMapper.updateByExample(record, example);
    }

    public int insert(Interface record) {
       	record.setWid((Long)this.sequenceService.getSequences("t_ams_interface").longValue());

        return this.interfaceMapper.insert(record);
    }

    public int insertSelective(Interface record) {
       	record.setWid((Long)this.sequenceService.getSequences("t_ams_interface").longValue());

        return this.interfaceMapper.insertSelective(record);
    }
}
package com.haibei.service.impl.application;

import com.haibei.dao.application.ParamsMapper;
import com.haibei.pojo.application.Params;
import com.haibei.pojo.application.ParamsExample;
import com.haibei.service.application.ParamsService;
import com.haibei.service.sys.SequenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParamsServiceImpl implements ParamsService {
    @Autowired
    private ParamsMapper paramsMapper;
    @Autowired
    private SequenceService sequenceService;
    public int countByExample(ParamsExample example) {
        int count = this.paramsMapper.countByExample(example);
        return count;
    }

    public Params selectByPrimaryKey(Long wid) {
        return this.paramsMapper.selectByPrimaryKey(wid);
    }

    public List<Params> selectByExample(ParamsExample example) {
        return this.paramsMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.paramsMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(Params record) {
        return this.paramsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Params record) {
        return this.paramsMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ParamsExample example) {
        return this.paramsMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Params record, ParamsExample example) {
        return this.paramsMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Params record, ParamsExample example) {
        return this.paramsMapper.updateByExample(record, example);
    }

    public int insert(Params record) {
    	record.setWid((Long)this.sequenceService.getSequences("t_ams_params").longValue());
        return this.paramsMapper.insert(record);
    }

    public int insertSelective(Params record) {
       	record.setWid((Long)this.sequenceService.getSequences("t_ams_params").longValue());
        return this.paramsMapper.insertSelective(record);
    }
}
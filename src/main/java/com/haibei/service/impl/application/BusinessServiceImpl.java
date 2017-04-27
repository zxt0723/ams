package com.haibei.service.impl.application;

import com.haibei.dao.application.BusinessMapper;
import com.haibei.pojo.application.Business;
import com.haibei.pojo.application.BusinessExample;
import com.haibei.service.application.BusinessService;
import com.haibei.service.sys.SequenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private SequenceService sequenceService;
    public int countByExample(BusinessExample example) {
        int count = this.businessMapper.countByExample(example);
        return count;
    }

    public Business selectByPrimaryKey(Long wid) {
        return this.businessMapper.selectByPrimaryKey(wid);
    }

    public List<Business> selectByExample(BusinessExample example) {
        return this.businessMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.businessMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(Business record) {
        return this.businessMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Business record) {
        return this.businessMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(BusinessExample example) {
        return this.businessMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Business record, BusinessExample example) {
        return this.businessMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Business record, BusinessExample example) {
        return this.businessMapper.updateByExample(record, example);
    }

    public int insert(Business record) {
    	record.setWid((Long)this.sequenceService.getSequences("t_ams_business").longValue());
    	
        return this.businessMapper.insert(record);
    }

    public int insertSelective(Business record) {
    	record.setWid((Long)this.sequenceService.getSequences("t_ams_business").longValue());
    	
        return this.businessMapper.insertSelective(record);
    }
}
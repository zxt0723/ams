package com.haibei.service.impl.application;

import com.haibei.dao.application.ResourceMapper;
import com.haibei.pojo.application.Resource;
import com.haibei.pojo.application.ResourceExample;
import com.haibei.service.application.ResourceService;
import com.haibei.service.sys.SequenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;
    @Autowired
    private SequenceService sequenceService;
    public int countByExample(ResourceExample example) {
        int count = this.resourceMapper.countByExample(example);
        return count;
    }

    public Resource selectByPrimaryKey(Long wid) {
        return this.resourceMapper.selectByPrimaryKey(wid);
    }

    public List<Resource> selectByExample(ResourceExample example) {
        return this.resourceMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.resourceMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(Resource record) {
        return this.resourceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Resource record) {
        return this.resourceMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ResourceExample example) {
        return this.resourceMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Resource record, ResourceExample example) {
        return this.resourceMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Resource record, ResourceExample example) {
        return this.resourceMapper.updateByExample(record, example);
    }

    public int insert(Resource record) {
       	record.setWid((Long)this.sequenceService.getSequences("t_ams_resource").longValue());
        return this.resourceMapper.insert(record);
    }

    public int insertSelective(Resource record) {
       	record.setWid((Long)this.sequenceService.getSequences("t_ams_resource").longValue());
        return this.resourceMapper.insertSelective(record);
    }
}
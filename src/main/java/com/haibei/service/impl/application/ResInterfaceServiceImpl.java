package com.haibei.service.impl.application;

import com.haibei.dao.application.ResInterfaceMapper;
import com.haibei.pojo.application.ResInterface;
import com.haibei.pojo.application.ResInterfaceExample;
import com.haibei.service.application.ResInterfaceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResInterfaceServiceImpl implements ResInterfaceService {
    @Autowired
    private ResInterfaceMapper resInterfaceMapper;

    public int countByExample(ResInterfaceExample example) {
        int count = this.resInterfaceMapper.countByExample(example);
        return count;
    }

    public ResInterface selectByPrimaryKey(Long wid) {
        return this.resInterfaceMapper.selectByPrimaryKey(wid);
    }

    public List<ResInterface> selectByExample(ResInterfaceExample example) {
        return this.resInterfaceMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long wid) {
        return this.resInterfaceMapper.deleteByPrimaryKey(wid);
    }

    public int updateByPrimaryKeySelective(ResInterface record) {
        return this.resInterfaceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResInterface record) {
        return this.resInterfaceMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ResInterfaceExample example) {
        return this.resInterfaceMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ResInterface record, ResInterfaceExample example) {
        return this.resInterfaceMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ResInterface record, ResInterfaceExample example) {
        return this.resInterfaceMapper.updateByExample(record, example);
    }

    public int insert(ResInterface record) {
        return this.resInterfaceMapper.insert(record);
    }

    public int insertSelective(ResInterface record) {
        return this.resInterfaceMapper.insertSelective(record);
    }
}
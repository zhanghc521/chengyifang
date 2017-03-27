package com.cyf.mapper;

import com.cyf.model.haveToGo;
import com.cyf.model.haveToGoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface haveToGoMapper {
    int countByExample(haveToGoExample example);

    int deleteByExample(haveToGoExample example);

    int deleteByPrimaryKey(String id);

    int insert(haveToGo record);

    int insertSelective(haveToGo record);

    List<haveToGo> selectByExample(haveToGoExample example);

    haveToGo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") haveToGo record, @Param("example") haveToGoExample example);

    int updateByExample(@Param("record") haveToGo record, @Param("example") haveToGoExample example);

    int updateByPrimaryKeySelective(haveToGo record);

    int updateByPrimaryKey(haveToGo record);
}
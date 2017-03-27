package com.cyf.mapper;

import com.cyf.model.haveToKnow;
import com.cyf.model.haveToKnowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface haveToKnowMapper {
    int countByExample(haveToKnowExample example);

    int deleteByExample(haveToKnowExample example);

    int deleteByPrimaryKey(String id);

    int insert(haveToKnow record);

    int insertSelective(haveToKnow record);

    List<haveToKnow> selectByExample(haveToKnowExample example);

    haveToKnow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") haveToKnow record, @Param("example") haveToKnowExample example);

    int updateByExample(@Param("record") haveToKnow record, @Param("example") haveToKnowExample example);

    int updateByPrimaryKeySelective(haveToKnow record);

    int updateByPrimaryKey(haveToKnow record);
}
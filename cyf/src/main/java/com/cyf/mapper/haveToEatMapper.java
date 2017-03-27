package com.cyf.mapper;

import com.cyf.model.haveToEat;
import com.cyf.model.haveToEatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface haveToEatMapper {
    int countByExample(haveToEatExample example);

    int deleteByExample(haveToEatExample example);

    int deleteByPrimaryKey(String id);

    int insert(haveToEat record);

    int insertSelective(haveToEat record);

    List<haveToEat> selectByExample(haveToEatExample example);

    haveToEat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") haveToEat record, @Param("example") haveToEatExample example);

    int updateByExample(@Param("record") haveToEat record, @Param("example") haveToEatExample example);

    int updateByPrimaryKeySelective(haveToEat record);

    int updateByPrimaryKey(haveToEat record);
}
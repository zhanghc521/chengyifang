package com.cyf.mapper;

import com.cyf.model.haveToBuy;
import com.cyf.model.haveToBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface haveToBuyMapper {
    int countByExample(haveToBuyExample example);

    int deleteByExample(haveToBuyExample example);

    int deleteByPrimaryKey(String id);

    int insert(haveToBuy record);

    int insertSelective(haveToBuy record);

    List<haveToBuy> selectByExample(haveToBuyExample example);

    haveToBuy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") haveToBuy record, @Param("example") haveToBuyExample example);

    int updateByExample(@Param("record") haveToBuy record, @Param("example") haveToBuyExample example);

    int updateByPrimaryKeySelective(haveToBuy record);

    int updateByPrimaryKey(haveToBuy record);
}
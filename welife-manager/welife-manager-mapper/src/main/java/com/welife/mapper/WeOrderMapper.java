package com.welife.mapper;

import com.welife.pojo.WeOrder;
import com.welife.pojo.WeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeOrderMapper {
    int countByExample(WeOrderExample example);

    int deleteByExample(WeOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(WeOrder record);

    int insertSelective(WeOrder record);

    List<WeOrder> selectByExample(WeOrderExample example);

    WeOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WeOrder record, @Param("example") WeOrderExample example);

    int updateByExample(@Param("record") WeOrder record, @Param("example") WeOrderExample example);

    int updateByPrimaryKeySelective(WeOrder record);

    int updateByPrimaryKey(WeOrder record);
}
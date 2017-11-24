package com.welife.mapper;

import com.welife.pojo.WeOrderItem;
import com.welife.pojo.WeOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeOrderItemMapper {
    int countByExample(WeOrderItemExample example);

    int deleteByExample(WeOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeOrderItem record);

    int insertSelective(WeOrderItem record);

    List<WeOrderItem> selectByExample(WeOrderItemExample example);

    WeOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeOrderItem record, @Param("example") WeOrderItemExample example);

    int updateByExample(@Param("record") WeOrderItem record, @Param("example") WeOrderItemExample example);

    int updateByPrimaryKeySelective(WeOrderItem record);

    int updateByPrimaryKey(WeOrderItem record);
}
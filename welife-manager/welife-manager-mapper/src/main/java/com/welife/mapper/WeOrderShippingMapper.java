package com.welife.mapper;

import com.welife.pojo.WeOrderShipping;
import com.welife.pojo.WeOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeOrderShippingMapper {
    int countByExample(WeOrderShippingExample example);

    int deleteByExample(WeOrderShippingExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(WeOrderShipping record);

    int insertSelective(WeOrderShipping record);

    List<WeOrderShipping> selectByExample(WeOrderShippingExample example);

    WeOrderShipping selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") WeOrderShipping record, @Param("example") WeOrderShippingExample example);

    int updateByExample(@Param("record") WeOrderShipping record, @Param("example") WeOrderShippingExample example);

    int updateByPrimaryKeySelective(WeOrderShipping record);

    int updateByPrimaryKey(WeOrderShipping record);
}
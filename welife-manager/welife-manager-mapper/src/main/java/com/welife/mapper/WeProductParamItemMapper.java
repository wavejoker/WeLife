package com.welife.mapper;

import com.welife.pojo.WeProductParamItem;
import com.welife.pojo.WeProductParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeProductParamItemMapper {
    int countByExample(WeProductParamItemExample example);

    int deleteByExample(WeProductParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeProductParamItem record);

    int insertSelective(WeProductParamItem record);

    List<WeProductParamItem> selectByExampleWithBLOBs(WeProductParamItemExample example);

    List<WeProductParamItem> selectByExample(WeProductParamItemExample example);

    WeProductParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeProductParamItem record, @Param("example") WeProductParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") WeProductParamItem record, @Param("example") WeProductParamItemExample example);

    int updateByExample(@Param("record") WeProductParamItem record, @Param("example") WeProductParamItemExample example);

    int updateByPrimaryKeySelective(WeProductParamItem record);

    int updateByPrimaryKeyWithBLOBs(WeProductParamItem record);

    int updateByPrimaryKey(WeProductParamItem record);
}
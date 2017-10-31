package com.welife.mapper;

import com.welife.pojo.WeProductParam;
import com.welife.pojo.WeProductParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeProductParamMapper {
    int countByExample(WeProductParamExample example);

    int deleteByExample(WeProductParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeProductParam record);

    int insertSelective(WeProductParam record);

    List<WeProductParam> selectByExampleWithBLOBs(WeProductParamExample example);

    List<WeProductParam> selectByExample(WeProductParamExample example);

    WeProductParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeProductParam record, @Param("example") WeProductParamExample example);

    int updateByExampleWithBLOBs(@Param("record") WeProductParam record, @Param("example") WeProductParamExample example);

    int updateByExample(@Param("record") WeProductParam record, @Param("example") WeProductParamExample example);

    int updateByPrimaryKeySelective(WeProductParam record);

    int updateByPrimaryKeyWithBLOBs(WeProductParam record);

    int updateByPrimaryKey(WeProductParam record);
}
package com.welife.mapper;

import com.welife.pojo.WeProductLvword;
import com.welife.pojo.WeProductLvwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeProductLvwordMapper {
    int countByExample(WeProductLvwordExample example);

    int deleteByExample(WeProductLvwordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeProductLvword record);

    int insertSelective(WeProductLvword record);

    List<WeProductLvword> selectByExampleWithBLOBs(WeProductLvwordExample example);

    List<WeProductLvword> selectByExample(WeProductLvwordExample example);

    WeProductLvword selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeProductLvword record, @Param("example") WeProductLvwordExample example);

    int updateByExampleWithBLOBs(@Param("record") WeProductLvword record, @Param("example") WeProductLvwordExample example);

    int updateByExample(@Param("record") WeProductLvword record, @Param("example") WeProductLvwordExample example);

    int updateByPrimaryKeySelective(WeProductLvword record);

    int updateByPrimaryKeyWithBLOBs(WeProductLvword record);

    int updateByPrimaryKey(WeProductLvword record);
}
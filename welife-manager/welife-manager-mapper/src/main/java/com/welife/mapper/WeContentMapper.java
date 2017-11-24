package com.welife.mapper;

import com.welife.pojo.WeContent;
import com.welife.pojo.WeContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeContentMapper {
    int countByExample(WeContentExample example);

    int deleteByExample(WeContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeContent record);

    int insertSelective(WeContent record);

    List<WeContent> selectByExampleWithBLOBs(WeContentExample example);

    List<WeContent> selectByExample(WeContentExample example);

    WeContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeContent record, @Param("example") WeContentExample example);

    int updateByExampleWithBLOBs(@Param("record") WeContent record, @Param("example") WeContentExample example);

    int updateByExample(@Param("record") WeContent record, @Param("example") WeContentExample example);

    int updateByPrimaryKeySelective(WeContent record);

    int updateByPrimaryKeyWithBLOBs(WeContent record);

    int updateByPrimaryKey(WeContent record);
}
package com.welife.mapper;

import com.welife.pojo.WeMessage;
import com.welife.pojo.WeMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeMessageMapper {
    int countByExample(WeMessageExample example);

    int deleteByExample(WeMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeMessage record);

    int insertSelective(WeMessage record);

    List<WeMessage> selectByExampleWithBLOBs(WeMessageExample example);

    List<WeMessage> selectByExample(WeMessageExample example);

    WeMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeMessage record, @Param("example") WeMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") WeMessage record, @Param("example") WeMessageExample example);

    int updateByExample(@Param("record") WeMessage record, @Param("example") WeMessageExample example);

    int updateByPrimaryKeySelective(WeMessage record);

    int updateByPrimaryKeyWithBLOBs(WeMessage record);

    int updateByPrimaryKey(WeMessage record);
}
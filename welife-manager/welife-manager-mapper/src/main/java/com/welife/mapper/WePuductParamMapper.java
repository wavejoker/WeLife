package com.welife.mapper;

import com.welife.pojo.WePuductParam;
import com.welife.pojo.WePuductParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WePuductParamMapper {
    int countByExample(WePuductParamExample example);

    int deleteByExample(WePuductParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WePuductParam record);

    int insertSelective(WePuductParam record);

    List<WePuductParam> selectByExampleWithBLOBs(WePuductParamExample example);

    List<WePuductParam> selectByExample(WePuductParamExample example);

    WePuductParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WePuductParam record, @Param("example") WePuductParamExample example);

    int updateByExampleWithBLOBs(@Param("record") WePuductParam record, @Param("example") WePuductParamExample example);

    int updateByExample(@Param("record") WePuductParam record, @Param("example") WePuductParamExample example);

    int updateByPrimaryKeySelective(WePuductParam record);

    int updateByPrimaryKeyWithBLOBs(WePuductParam record);

    int updateByPrimaryKey(WePuductParam record);
}
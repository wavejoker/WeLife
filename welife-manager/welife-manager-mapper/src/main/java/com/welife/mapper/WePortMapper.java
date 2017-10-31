package com.welife.mapper;

import com.welife.pojo.WePort;
import com.welife.pojo.WePortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WePortMapper {
    int countByExample(WePortExample example);

    int deleteByExample(WePortExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WePort record);

    int insertSelective(WePort record);

    List<WePort> selectByExampleWithBLOBs(WePortExample example);

    List<WePort> selectByExample(WePortExample example);

    WePort selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WePort record, @Param("example") WePortExample example);

    int updateByExampleWithBLOBs(@Param("record") WePort record, @Param("example") WePortExample example);

    int updateByExample(@Param("record") WePort record, @Param("example") WePortExample example);

    int updateByPrimaryKeySelective(WePort record);

    int updateByPrimaryKeyWithBLOBs(WePort record);

    int updateByPrimaryKey(WePort record);
}
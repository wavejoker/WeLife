package com.welife.mapper;

import com.welife.pojo.WeProductDesc;
import com.welife.pojo.WeProductDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeProductDescMapper {
    int countByExample(WeProductDescExample example);

    int deleteByExample(WeProductDescExample example);

    int deleteByPrimaryKey(Long productId);

    int insert(WeProductDesc record);

    int insertSelective(WeProductDesc record);

    List<WeProductDesc> selectByExampleWithBLOBs(WeProductDescExample example);

    List<WeProductDesc> selectByExample(WeProductDescExample example);

    WeProductDesc selectByPrimaryKey(Long productId);

    int updateByExampleSelective(@Param("record") WeProductDesc record, @Param("example") WeProductDescExample example);

    int updateByExampleWithBLOBs(@Param("record") WeProductDesc record, @Param("example") WeProductDescExample example);

    int updateByExample(@Param("record") WeProductDesc record, @Param("example") WeProductDescExample example);

    int updateByPrimaryKeySelective(WeProductDesc record);

    int updateByPrimaryKeyWithBLOBs(WeProductDesc record);
}
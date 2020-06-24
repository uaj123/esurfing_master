package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSpuInfoDesc;
import cn.uaj.mall.entity.pms.PmsSpuInfoDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSpuInfoDescMapper {
    long countByExample(PmsSpuInfoDescExample example);

    int deleteByExample(PmsSpuInfoDescExample example);

    int deleteByPrimaryKey(Long spuId);

    int insert(PmsSpuInfoDesc record);

    int insertSelective(PmsSpuInfoDesc record);

    List<PmsSpuInfoDesc> selectByExampleWithBLOBs(PmsSpuInfoDescExample example);

    List<PmsSpuInfoDesc> selectByExample(PmsSpuInfoDescExample example);

    PmsSpuInfoDesc selectByPrimaryKey(Long spuId);

    int updateByExampleSelective(@Param("record") PmsSpuInfoDesc record, @Param("example") PmsSpuInfoDescExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsSpuInfoDesc record, @Param("example") PmsSpuInfoDescExample example);

    int updateByExample(@Param("record") PmsSpuInfoDesc record, @Param("example") PmsSpuInfoDescExample example);

    int updateByPrimaryKeySelective(PmsSpuInfoDesc record);

    int updateByPrimaryKeyWithBLOBs(PmsSpuInfoDesc record);
}
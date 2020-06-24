package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSpuInfo;
import cn.uaj.mall.entity.pms.PmsSpuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSpuInfoMapper {
    long countByExample(PmsSpuInfoExample example);

    int deleteByExample(PmsSpuInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuInfo record);

    int insertSelective(PmsSpuInfo record);

    List<PmsSpuInfo> selectByExample(PmsSpuInfoExample example);

    PmsSpuInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSpuInfo record, @Param("example") PmsSpuInfoExample example);

    int updateByExample(@Param("record") PmsSpuInfo record, @Param("example") PmsSpuInfoExample example);

    int updateByPrimaryKeySelective(PmsSpuInfo record);

    int updateByPrimaryKey(PmsSpuInfo record);
}
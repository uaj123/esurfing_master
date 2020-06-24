package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSpuImages;
import cn.uaj.mall.entity.pms.PmsSpuImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSpuImagesMapper {
    long countByExample(PmsSpuImagesExample example);

    int deleteByExample(PmsSpuImagesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuImages record);

    int insertSelective(PmsSpuImages record);

    List<PmsSpuImages> selectByExample(PmsSpuImagesExample example);

    PmsSpuImages selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSpuImages record, @Param("example") PmsSpuImagesExample example);

    int updateByExample(@Param("record") PmsSpuImages record, @Param("example") PmsSpuImagesExample example);

    int updateByPrimaryKeySelective(PmsSpuImages record);

    int updateByPrimaryKey(PmsSpuImages record);
}
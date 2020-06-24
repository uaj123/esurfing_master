package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsProductAttrValue;
import cn.uaj.mall.entity.pms.PmsProductAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttrValueMapper {
    long countByExample(PmsProductAttrValueExample example);

    int deleteByExample(PmsProductAttrValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttrValue record);

    int insertSelective(PmsProductAttrValue record);

    List<PmsProductAttrValue> selectByExample(PmsProductAttrValueExample example);

    PmsProductAttrValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttrValue record, @Param("example") PmsProductAttrValueExample example);

    int updateByExample(@Param("record") PmsProductAttrValue record, @Param("example") PmsProductAttrValueExample example);

    int updateByPrimaryKeySelective(PmsProductAttrValue record);

    int updateByPrimaryKey(PmsProductAttrValue record);
}
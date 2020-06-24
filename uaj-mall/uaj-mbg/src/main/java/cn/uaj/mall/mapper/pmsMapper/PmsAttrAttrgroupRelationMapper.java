package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsAttrAttrgroupRelation;
import cn.uaj.mall.entity.pms.PmsAttrAttrgroupRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAttrAttrgroupRelationMapper {
    long countByExample(PmsAttrAttrgroupRelationExample example);

    int deleteByExample(PmsAttrAttrgroupRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsAttrAttrgroupRelation record);

    int insertSelective(PmsAttrAttrgroupRelation record);

    List<PmsAttrAttrgroupRelation> selectByExample(PmsAttrAttrgroupRelationExample example);

    PmsAttrAttrgroupRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsAttrAttrgroupRelation record, @Param("example") PmsAttrAttrgroupRelationExample example);

    int updateByExample(@Param("record") PmsAttrAttrgroupRelation record, @Param("example") PmsAttrAttrgroupRelationExample example);

    int updateByPrimaryKeySelective(PmsAttrAttrgroupRelation record);

    int updateByPrimaryKey(PmsAttrAttrgroupRelation record);
}
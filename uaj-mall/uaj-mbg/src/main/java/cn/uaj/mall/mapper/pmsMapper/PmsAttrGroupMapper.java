package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsAttrGroup;
import cn.uaj.mall.entity.pms.PmsAttrGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAttrGroupMapper {
    long countByExample(PmsAttrGroupExample example);

    int deleteByExample(PmsAttrGroupExample example);

    int deleteByPrimaryKey(Long attrGroupId);

    int insert(PmsAttrGroup record);

    int insertSelective(PmsAttrGroup record);

    List<PmsAttrGroup> selectByExample(PmsAttrGroupExample example);

    PmsAttrGroup selectByPrimaryKey(Long attrGroupId);

    int updateByExampleSelective(@Param("record") PmsAttrGroup record, @Param("example") PmsAttrGroupExample example);

    int updateByExample(@Param("record") PmsAttrGroup record, @Param("example") PmsAttrGroupExample example);

    int updateByPrimaryKeySelective(PmsAttrGroup record);

    int updateByPrimaryKey(PmsAttrGroup record);
}
package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsAttr;
import cn.uaj.mall.entity.pms.PmsAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAttrMapper {
    long countByExample(PmsAttrExample example);

    int deleteByExample(PmsAttrExample example);

    int deleteByPrimaryKey(Long attrId);

    int insert(PmsAttr record);

    int insertSelective(PmsAttr record);

    List<PmsAttr> selectByExample(PmsAttrExample example);

    PmsAttr selectByPrimaryKey(Long attrId);

    int updateByExampleSelective(@Param("record") PmsAttr record, @Param("example") PmsAttrExample example);

    int updateByExample(@Param("record") PmsAttr record, @Param("example") PmsAttrExample example);

    int updateByPrimaryKeySelective(PmsAttr record);

    int updateByPrimaryKey(PmsAttr record);
}
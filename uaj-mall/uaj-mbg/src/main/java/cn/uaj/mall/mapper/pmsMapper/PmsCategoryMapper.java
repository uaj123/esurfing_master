package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsCategory;
import cn.uaj.mall.entity.pms.PmsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCategoryMapper {
    long countByExample(PmsCategoryExample example);

    int deleteByExample(PmsCategoryExample example);

    int deleteByPrimaryKey(Long catId);

    int insert(PmsCategory record);

    int insertSelective(PmsCategory record);

    List<PmsCategory> selectByExample(PmsCategoryExample example);

    PmsCategory selectByPrimaryKey(Long catId);

    int updateByExampleSelective(@Param("record") PmsCategory record, @Param("example") PmsCategoryExample example);

    int updateByExample(@Param("record") PmsCategory record, @Param("example") PmsCategoryExample example);

    int updateByPrimaryKeySelective(PmsCategory record);

    int updateByPrimaryKey(PmsCategory record);
}